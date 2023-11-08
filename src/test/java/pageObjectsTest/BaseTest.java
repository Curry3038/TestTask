package pageObjectsTest;

import com.github.javafaker.Faker;
import enums.BrowserType;
import helper.BrowserFabric;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    protected WebDriver driver;
    protected String url;
    protected Faker faker;


    @BeforeMethod
    public void startUp() {
        driver = BrowserFabric.getDriver(BrowserType.CHROME);
        url = ("https://demoqa.com/");
        faker = new Faker();

    }

    @AfterMethod
    public void tearDown() {
        driver.quit();

    }
}
