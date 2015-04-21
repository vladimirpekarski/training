package pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static helpers.Locators.getLocator;

public class LoginPage {
    public static final By EMAIL_FIELD = getLocator("facebookLoginPage.emailField");
    public static final By PASSWORD_FIELD = getLocator("facebookLoginPage.passwordField");
    public static final By LOGIN_BUTTON = getLocator("facebookLoginPage.loginButton");

    public static void login(String userName, String userPass) {
        $(EMAIL_FIELD).setValue(userName);
        $(PASSWORD_FIELD).setValue(userPass);
        $(LOGIN_BUTTON).click();
    }
}
