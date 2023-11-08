import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SimpleTest {
    private WebDriver driver;

    @BeforeMethod
    public void startUp(){
        System.setProperty("web.chrome.driver","chromedriver");
        driver=new ChromeDriver();
        driver.get("https://demoqa.com/");
    }
    @AfterClass
    public void tearDown()throws InterruptedException{
        Thread.sleep(3000);
        driver.quit();
    }
    @Test
    public void run(){
        System.setProperty("web.chrome.driver","chromedriver");
    }
}
