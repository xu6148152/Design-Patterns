package bristol.zepp.com.bridge;

/**
 * Created by xubinggui on 2/16/16.
 */
public class BlindingMagicWeapon extends MagicWeapon {

    public BlindingMagicWeapon(MagicWeaponImpl imp) {
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

    @Override public BlindingMagicWeaponImpl getImp() {
        return (BlindingMagicWeaponImpl) imp;
    }

    public void blind() {
        getImp().blindImp();
    }
}
