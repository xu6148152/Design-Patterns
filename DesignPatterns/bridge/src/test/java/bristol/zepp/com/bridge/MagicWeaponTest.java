package bristol.zepp.com.bridge;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.internal.verification.VerificationModeFactory.times;

/**
 * Created by xubinggui on 2/16/16.
 */
public class MagicWeaponTest {

    /**
     * Invoke the basic actions of the given weapon, and test if the underlying weapon
     * implementation
     * is invoked
     *
     * @param weaponImpl The spied weapon implementation where actions are bridged to
     * @param weapon The weapon, handled by the app
     */
    protected final void testBasicWeaponActions(final MagicWeapon weapon,
            final MagicWeaponImpl weaponImpl) {
        assertNotNull(weapon);
        assertNotNull(weaponImpl);
        assertNotNull(weapon.getImp());

        weapon.swing();
        verify(weaponImpl, times(1)).swingImp();
        verifyNoMoreInteractions(weaponImpl);

        weapon.wield();
        verify(weaponImpl, times(1)).wieldImp();
        verifyNoMoreInteractions(weaponImpl);

        weapon.unwield();
        verify(weaponImpl, times(1)).unwieldImp();
        verifyNoMoreInteractions(weaponImpl);
    }
}
