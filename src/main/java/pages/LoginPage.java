package pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    public static final By EMAIL_FIELD = By.id("email");
    public static final By PASSWORD_FIELD = By.id("pass");
    public static final By LOGIN_BUTTON = By.cssSelector("input[type='submit']");

    public static void login(String userName, String userPass) {
        $(EMAIL_FIELD).setValue(userName);
        $(PASSWORD_FIELD).setValue(userPass);
        $(LOGIN_BUTTON).click();
    }
}
