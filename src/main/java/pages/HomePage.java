package pages;

import core.basepage.BasePage;
import org.openqa.selenium.By;

import static helpers.Locators.getLocator;

public class HomePage {
    public static final By FB_WELCOME_BOX_NAME = getLocator("facebookHomePage.fbWelcomeBoxName");

    public static void shoulBeHomePage() {
        BasePage.shouldBeLoadedAndElementVisible(FB_WELCOME_BOX_NAME);
    }
}
