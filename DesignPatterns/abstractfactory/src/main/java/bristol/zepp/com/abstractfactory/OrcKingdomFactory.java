package bristol.zepp.com.abstractfactory;

/**
 * Created by xubinggui on 2/13/16.
 */
public class OrcKingdomFactory implements KingdomFactory {

    @Override public Castle createCastle() {
        return new OrcCastle();
    }

    @Override public King createKing() {
        return new OrcKing();
    }

    @Override public Army createArmy() {
        return new OrcArmy();
    }
}
