package bristol.zepp.com.abstractfactory;

/**
 * Created by xubinggui on 2/13/16.
 */
public class ElfKingdomFactory implements KingdomFactory {

    @Override public Castle createCastle() {
        return new ElfCastle();
    }

    @Override public King createKing() {
        return new ElfKing();
    }

    @Override public Army createArmy() {
        return new ElfArmy();
    }
}
