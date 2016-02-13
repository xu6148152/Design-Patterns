package bristol.zepp.com.abstractfactory;

/**
 * Created by xubinggui on 2/13/16.
 */
public class ElfArmy implements Army {

    static final String DESCRIPTION = "This is the Elven Army!";

    @Override public String getDescription() {
        return DESCRIPTION;
    }
}
