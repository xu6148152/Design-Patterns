package bristol.zepp.com.adapter;

/**
 * Created by xubinggui on 2/13/16.
 */
public class Captain implements BattleShip {

    private BattleShip battleship;

    public Captain() {
    }

    public Captain(BattleShip battleship) {
        this.battleship = battleship;
    }

    public void setBattleship(BattleShip battleship) {
        this.battleship = battleship;
    }

    @Override public void fire() {
        battleship.fire();
    }

    @Override public void move() {
        battleship.move();
    }
}
