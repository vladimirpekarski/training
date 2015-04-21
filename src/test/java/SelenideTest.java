import core.basetest.TestBase;
import org.testng.annotations.Test;
import pages.LoginPage;

import static helpers.User.getUserCred;

public class SelenideTest extends TestBase {
    private String userName = getUserCred("vlad.pek")[0];
    private String userPass = getUserCred("vlad.pek")[1];

    @Test
    public void testOpen() {
        LoginPage.login(userName, userPass);
    }
}
