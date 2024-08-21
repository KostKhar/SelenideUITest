package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class BaseTest {

    protected final static String appleExist = "Чем Iphone 13 отличается от Iphone 12";
    protected final static String appleUrl = "https://appleinsider.ru/";

    @BeforeEach
    public void init() {
        SetUp();
    }

    @AfterEach
    public void tearDown() {
        Selenide.closeWebDriver();
    }


    public void SetUp() {
        WebDriverManager.chromedriver().setup();
        Configuration.browser = "chrome";
        Configuration.browserSize = "1920*1080";
        Configuration.headless = true;
        Configuration.webdriverLogsEnabled = true;
    }
}
