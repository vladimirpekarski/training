import core.basetest.TestBase;
import org.testng.annotations.Test;
import pages.LoginPage;

public class SelenideTest extends TestBase {
    @Test
    public void testOpen() {
        LoginPage.login("test", "test");
    }
}
