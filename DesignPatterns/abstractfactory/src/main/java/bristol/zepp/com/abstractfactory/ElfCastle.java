package bristol.zepp.com.abstractfactory;

/**
 * Created by xubinggui on 2/13/16.
 */
public class ElfCastle implements Castle {
    static final String DESCRIPTION = "This is the Elven castle!";

    @Override public String getDescription() {
        return DESCRIPTION;
    }
}
