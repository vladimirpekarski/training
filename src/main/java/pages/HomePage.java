package pages;

import core.basepage.BasePage;
import org.openqa.selenium.By;
import ru.yandex.qatools.allure.annotations.Step;

import static com.codeborne.selenide.Selenide.$;
import static helpers.Locators.getLocator;

public class HomePage {
    public static final By FB_WELCOME_BOX_NAME = getLocator("facebookHomePage.fbWelcomeBoxName");
    public static final By WHATS_IN_YOUR_MIND_TEXTAREA = getLocator("facebookHomePage.whatsInYourMindTextarea");
    public static final By WHATS_IN_YOUR_MIND_POST_BUTTON = getLocator("facebookHomePage.whatsInYourMindPostButton");

    @Step
    public static void shouldBeHomePage() {
        BasePage.shouldBeLoadedAndElementVisible(FB_WELCOME_BOX_NAME);
    }

    @Step
    public static void typeToWhatsInYourMindTextarea(String value) {
        $(WHATS_IN_YOUR_MIND_TEXTAREA).setValue(value);
    }

    @Step
    public static void clickWhatsInYourMindButton() {
        $(WHATS_IN_YOUR_MIND_POST_BUTTON).click();
    }

    @Step
    public static void postWhatsInYourMindMessage(String message) {
        typeToWhatsInYourMindTextarea(message);
        clickWhatsInYourMindButton();
    }
}
