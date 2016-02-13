package bristol.zepp.com.adapter;

/**
 * Created by xubinggui on 2/13/16.
 */
public class BattleFishingBoat implements BattleShip {

    private FishingBoat boat;

    public BattleFishingBoat() {
        boat = new FishingBoat();
    }

    @Override
    public void fire() {
        System.out.println("fire!");
    }

    @Override
    public void move() {
        boat.sail();
    }
}
