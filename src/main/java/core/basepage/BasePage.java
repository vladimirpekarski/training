package core.basepage;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class BasePage {
    public static void shouldBeLoadedAndElementVisible(By locator) {
        $(locator).shouldBe(Condition.visible);
    }
}
