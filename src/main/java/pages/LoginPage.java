package pages;

import core.basepage.BasePage;
import org.openqa.selenium.By;
import ru.yandex.qatools.allure.annotations.Step;

import static com.codeborne.selenide.Selenide.$;
import static helpers.Locators.getLocator;

public class LoginPage {
    public static final By EMAIL_FIELD = getLocator("facebookLoginPage.emailField");
    public static final By PASSWORD_FIELD = getLocator("facebookLoginPage.passwordField");
    public static final By LOGIN_BUTTON = getLocator("facebookLoginPage.loginButton");
    public static final By SING_UP_BUTTON = getLocator("facebookLoginPage.signUpButton");

    @Step
    public static void shouldBeLoginPage() {
        BasePage.shouldBeLoadedAndElementVisible(SING_UP_BUTTON);
    }

    @Step
    public static void login(String userName, String userPass) {
        $(EMAIL_FIELD).setValue(userName);
        $(PASSWORD_FIELD).setValue(userPass);
        $(LOGIN_BUTTON).click();
    }
}
