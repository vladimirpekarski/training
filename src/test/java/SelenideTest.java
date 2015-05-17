import core.basetest.TestBase;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;

import static helpers.User.getUserCred;

public class SelenideTest extends TestBase {
    private String userName = getUserCred("vlad.pek")[0];
    private String userPass = getUserCred("vlad.pek")[1];

    @Features("Login to Fb")

    @Stories("user successful logged in")

    @Test
    public void logInToFb() {
        LoginPage.shouldBeLoginPage();
        LoginPage.login(userName, userPass);
        HomePage.shouldBeHomePage();
        HomePage.postWhatsInYourMindMessage("Auto test");
    }
}
