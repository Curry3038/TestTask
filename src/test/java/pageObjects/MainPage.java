package pageObjects;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage extends BasePage {


    public MainPage(WebDriver driver) {

        super(driver);
    }

    private WebElement getElementsIcon() {
        return driver.findElement(By.xpath("(//*[@class='card mt-4 top-card'])[1]"));
    }

    @Step("Перейти на https://demoqa.com/")
    public void open(String url) {
        driver.get(url);
    }

    @Step("Нажимаем на Elements  и переходим на страницу Elements ")
    public ElementsPage moveToElementsPage() {
        getElementsIcon().click();
        return new ElementsPage(driver);
    }

}
