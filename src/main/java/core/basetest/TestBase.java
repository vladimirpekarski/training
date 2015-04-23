package core.basetest;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;



public class TestBase {
    public static final String BASE_URL = "http://facebook.com";

    @BeforeTest
    public void configure() {
        Configuration.baseUrl = System.getProperty("baseURL", BASE_URL);
        Configuration.timeout = 10000;
    }

    @BeforeMethod
    public void setup() {
        Selenide.open("/");
    }
}
