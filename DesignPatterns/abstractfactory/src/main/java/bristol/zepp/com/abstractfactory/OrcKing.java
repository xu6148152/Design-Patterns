package bristol.zepp.com.abstractfactory;

/**
 * Created by xubinggui on 2/13/16.
 */
public class OrcKing implements King {
    static final String DESCRIPTION = "This is the Orc king!";

    @Override public String getDescription() {
        return DESCRIPTION;
    }
}
