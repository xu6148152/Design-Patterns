package bristol.zepp.com.bridge;

import org.junit.Test;

import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.internal.verification.VerificationModeFactory.times;

/**
 * Created by xubinggui on 2/16/16.
 */
public class SoulEatingMagicWeaponTest extends MagicWeaponTest {
    /**
     * Invoke all possible actions on the weapon and check if the actions are executed on the
     * actual
     * underlying weapon implementation.
     */
    @Test public void testStormBringer() throws Exception {
        final Stormbringer stormbringer = spy(new Stormbringer());
        final SoulEatingMagicWeapon soulEatingMagicWeapon = new SoulEatingMagicWeapon(stormbringer);

        testBasicWeaponActions(soulEatingMagicWeapon, stormbringer);

        soulEatingMagicWeapon.eatSoul();
        verify(stormbringer, times(1)).eatSoulImp();
        verifyNoMoreInteractions(stormbringer);
    }
}
