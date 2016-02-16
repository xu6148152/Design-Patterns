package bristol.zepp.com.bridge;

/**
 * Created by xubinggui on 2/16/16.
 */
public abstract class MagicWeapon {

    protected MagicWeaponImpl imp;

    public MagicWeapon(MagicWeaponImpl imp) {
        this.imp = imp;
    }

    public abstract void wield();

    public abstract void swing();

    public abstract void unwield();

    public MagicWeaponImpl getImp() {
        return imp;
    }
}
