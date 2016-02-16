package bristol.zepp.com.bridge;

import org.junit.Test;

import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.internal.verification.VerificationModeFactory.times;

/**
 * Created by xubinggui on 2/16/16.
 */
public class FlyingMagicWeaponTest extends MagicWeaponTest {

    /**
     * Invoke all possible actions on the weapon and check if the actions are executed on the
     * actual
     * underlying weapon implementation.
     */
    @Test public void testMjollnir() throws Exception {
        final Mjollnir mjollnir = spy(new Mjollnir());
        final FlyingMagicWeapon flyingMagicWeapon = new FlyingMagicWeapon(mjollnir);

        testBasicWeaponActions(flyingMagicWeapon, mjollnir);

        flyingMagicWeapon.fly();
        verify(mjollnir, times(1)).flyImp();
        verifyNoMoreInteractions(mjollnir);
    }
}
