package com.example;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Stream;
import javax.sql.DataSource;

/**
 * Data Access Object (DAO) is an object that provides an abstract interface to some type of
 * database or other persistence mechanism. By mapping application calls to the persistence layer,
 * DAO provide some specific data operations without exposing details of the database. This
 * isolation supports the Single responsibility principle. It separates what data accesses the
 * application needs, in terms of domain-specific objects and data types (the public interface of
 * the DAO), from how these needs can be satisfied with a specific DBMS.
 *
 * <p>With the DAO pattern, we can use various method calls to retrieve/add/delete/update data
 * without directly interacting with the data source. The below example demonstrates basic CRUD
 * operations: select, add, update, and delete.
 */
public class App {
    //private static final String DB_URL = "jdbc:h2:~/dao";
    //private static Logger log = Logger.getLogger(App.class);
    //
    ///**
    // * Program entry point.
    // *
    // * @param args command line args.
    // * @throws Exception if any error occurs.
    // */
    //public static void main(final String[] args) throws Exception {
    //    final CustomerDao inMemoryDao = new InMemoryCustomerDao();
    //    performOperationsUsing(inMemoryDao);
    //
    //    final DataSource dataSource = createDataSource();
    //    createSchema(dataSource);
    //    final CustomerDao dbDao = new DbCustomerDao(dataSource);
    //    performOperationsUsing(dbDao);
    //    deleteSchema(dataSource);
    //}
    //
    //private static void deleteSchema(DataSource dataSource) throws SQLException {
    //    try (Connection connection = dataSource.getConnection();
    //         Statement statement = connection.createStatement()) {
    //        statement.execute(CustomerSchemaSql.DELETE_SCHEMA_SQL);
    //    }
    //}
    //
    //private static void createSchema(DataSource dataSource) throws SQLException {
    //    try (Connection connection = dataSource.getConnection();
    //         Statement statement = connection.createStatement()) {
    //        statement.execute(CustomerSchemaSql.CREATE_SCHEMA_SQL);
    //    }
    //}
    //
    //private static DataSource createDataSource() {
    //    JdbcDataSource dataSource = new JdbcDataSource();
    //    dataSource.setURL(DB_URL);
    //    return dataSource;
    //}
    //
    //private static void performOperationsUsing(final CustomerDao customerDao) throws Exception {
    //    addCustomers(customerDao);
    //    log.info("customerDao.getAllCustomers(): ");
    //    try (Stream<Customer> customerStream = customerDao.getAll()) {
    //        customerStream.forEach((customer) -> log.info(customer));
    //    }
    //    log.info("customerDao.getCustomerById(2): " + customerDao.getById(2));
    //    final Customer customer = new Customer(4, "Dan", "Danson");
    //    customerDao.add(customer);
    //    log.info("customerDao.getAllCustomers(): " + customerDao.getAll());
    //    customer.setFirstName("Daniel");
    //    customer.setLastName("Danielson");
    //    customerDao.update(customer);
    //    log.info("customerDao.getAllCustomers(): ");
    //    try (Stream<Customer> customerStream = customerDao.getAll()) {
    //        customerStream.forEach((cust) -> log.info(cust));
    //    }
    //    customerDao.delete(customer);
    //    log.info("customerDao.getAllCustomers(): " + customerDao.getAll());
    //}
    //
    //private static void addCustomers(CustomerDao customerDao) throws Exception {
    //    for (Customer customer : generateSampleCustomers()) {
    //        customerDao.add(customer);
    //    }
    //}
    //
    ///**
    // * Generate customers.
    // *
    // * @return list of customers.
    // */
    //public static List<Customer> generateSampleCustomers() {
    //    final Customer customer1 = new Customer(1, "Adam", "Adamson");
    //    final Customer customer2 = new Customer(2, "Bob", "Bobson");
    //    final Customer customer3 = new Customer(3, "Carl", "Carlson");
    //    final List<Customer> customers = new ArrayList<>();
    //    customers.add(customer1);
    //    customers.add(customer2);
    //    customers.add(customer3);
    //    return customers;
    //}
}