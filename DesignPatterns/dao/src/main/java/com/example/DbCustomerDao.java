package com.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.function.Consumer;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import javax.sql.DataSource;

/**
 * An implementation of {@link CustomerDao} that persists customers in RDBMS.
 */
public class DbCustomerDao implements CustomerDao {

    private final DataSource dataSource;

    /**
     * Creates an instance of {@link DbCustomerDao} which uses provided <code>dataSource</code>
     * to store and retrieve customer information.
     *
     * @param dataSource a non-null dataSource.
     */
    public DbCustomerDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    /**
     * @return a lazily populated stream of customers. Note the stream returned must be closed to
     * free all the acquired resources. The stream keeps an open connection to the database till
     * it is complete or is closed manually.
     */
    @Override public Stream<Customer> getAll() throws Exception {

        Connection connection;
        try {
            connection = getConnection();
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM CUSTOMERS");
            ResultSet resultSet = statement.executeQuery();
            return StreamSupport.stream(new Spliterators.AbstractSpliterator<Customer>(Long.MAX_VALUE, Spliterator.ORDERED) {

                @Override public boolean tryAdvance(Consumer<? super Customer> action) {
                    try {
                        if (!resultSet.next()) {
                            return false;
                        }
                        action.accept(createCustomer(resultSet));
                        return true;
                    } catch (SQLException e) {
                        throw new RuntimeException(e);
                    }
                }
            }, false).onClose(() -> mutedClose(connection));
        } catch (SQLException e) {
            throw new Exception(e.getMessage(), e);
        }
    }

    private Connection getConnection() throws SQLException {
        return dataSource.getConnection();
    }

    private void mutedClose(Connection connection) {
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private Customer createCustomer(ResultSet resultSet) throws SQLException {
        return new Customer(resultSet.getInt("ID"), resultSet.getString("FNAME"), resultSet.getString("LNAME"));
    }

    /**
     * {@inheritDoc}
     */
    @Override public Optional<Customer> getById(int id) throws Exception {
        try (Connection connection = getConnection();
             PreparedStatement statement = connection.prepareStatement("SELECT * FROM CUSTOMERS WHERE ID = ?")) {

            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                return Optional.of(createCustomer(resultSet));
            } else {
                return Optional.empty();
            }
        } catch (SQLException ex) {
            throw new Exception(ex.getMessage(), ex);
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override public boolean add(Customer customer) throws Exception {
        if (getById(customer.getId()).isPresent()) {
            return false;
        }

        try (Connection connection = getConnection();
             PreparedStatement statement = connection.prepareStatement("INSERT INTO CUSTOMERS VALUES (?,?,?)")) {
            statement.setInt(1, customer.getId());
            statement.setString(2, customer.getFirstName());
            statement.setString(3, customer.getLastName());
            statement.execute();
            return true;
        } catch (SQLException ex) {
            throw new Exception(ex.getMessage(), ex);
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override public boolean update(Customer customer) throws Exception {
        try (Connection connection = getConnection();
             PreparedStatement statement = connection.prepareStatement("UPDATE CUSTOMERS SET FNAME = ?, LNAME = ? WHERE ID = ?")) {
            statement.setString(1, customer.getFirstName());
            statement.setString(2, customer.getLastName());
            statement.setInt(3, customer.getId());
            return statement.executeUpdate() > 0;
        } catch (SQLException ex) {
            throw new Exception(ex.getMessage(), ex);
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override public boolean delete(Customer customer) throws Exception {
        try (Connection connection = getConnection();
             PreparedStatement statement = connection.prepareStatement("DELETE FROM CUSTOMERS WHERE ID = ?")) {
            statement.setInt(1, customer.getId());
            return statement.executeUpdate() > 0;
        } catch (SQLException ex) {
            throw new Exception(ex.getMessage(), ex);
        }
    }
}