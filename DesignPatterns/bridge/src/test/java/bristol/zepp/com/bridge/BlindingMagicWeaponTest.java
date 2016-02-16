package bristol.zepp.com.bridge;

import org.junit.Test;

import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.internal.verification.VerificationModeFactory.times;

/**
 * Created by xubinggui on 2/16/16.
 */
public class BlindingMagicWeaponTest extends MagicWeaponTest {
    /**
     * Invoke all possible actions on the weapon and check if the actions are executed on the
     * actual
     * underlying weapon implementation.
     */
    @Test public void testExcalibur() throws Exception {
        final Excalibur excalibur = spy(new Excalibur());
        final BlindingMagicWeapon blindingMagicWeapon = new BlindingMagicWeapon(excalibur);

        testBasicWeaponActions(blindingMagicWeapon, excalibur);

        blindingMagicWeapon.blind();
        verify(excalibur, times(1)).blindImp();
        verifyNoMoreInteractions(excalibur);
    }
}
