package bristol.zepp.com.bridge;

/**
 * Created by xubinggui on 2/16/16.
 */
public class SoulEatingMagicWeapon extends MagicWeapon {

    public SoulEatingMagicWeapon(MagicWeaponImpl imp) {
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

    @Override public SoulEatingMagicWeaponImpl getImp() {
        return (SoulEatingMagicWeaponImpl) imp;
    }

    public void eatSoul() {
        getImp().eatSoulImp();
    }
}
