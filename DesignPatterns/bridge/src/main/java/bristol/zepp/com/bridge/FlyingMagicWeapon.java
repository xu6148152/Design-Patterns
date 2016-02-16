package bristol.zepp.com.bridge;

/**
 * Created by xubinggui on 2/16/16.
 */
public class FlyingMagicWeapon extends MagicWeapon {

    public FlyingMagicWeapon(MagicWeaponImpl imp) {
        super(imp);
    }

    @Override public void wield() {
        getImp().wieldImp();
    }

    @Override public void swing() {
        getImp().swingImp();
    }

    @Override public void unwield() {
        getImp().unwieldImp();
    }

    @Override public FlyingMagicWeaponImpl getImp() {
        return (FlyingMagicWeaponImpl) imp;
    }

    public void fly() {
        getImp().flyImp();
    }
}
