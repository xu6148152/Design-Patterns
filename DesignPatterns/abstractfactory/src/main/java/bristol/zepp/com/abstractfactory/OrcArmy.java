package bristol.zepp.com.abstractfactory;

/**
 * Created by xubinggui on 2/13/16.
 */
public class OrcArmy implements Army {

    static final String DESCRIPTION = "This is the Orc Army!";

    @Override public String getDescription() {
        return DESCRIPTION;
    }
}
