package bristol.zepp.com.abstractfactory;

/**
 * Created by xubinggui on 2/13/16.
 */
public interface KingdomFactory {
    Castle createCastle();

    King createKing();

    Army createArmy();
}
