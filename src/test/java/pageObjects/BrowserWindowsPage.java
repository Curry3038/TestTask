package pageObjects;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import java.util.ArrayList;

public class BrowserWindowsPage extends BasePage {


    public BrowserWindowsPage(WebDriver driver) {
        super(driver);

    }

    private WebElement getBlueButton_newTab() {
        return driver.findElement(By.xpath("//*[text()='New Tab']"));

    }

    @Step("Кликаем на синию кнопку New Tab ")
    public void BlueButton_newTab() {
        getBlueButton_newTab().click();


    }

    private WebElement getBlueButton_newWindow() {
        return driver.findElement(By.xpath("//*[@id='windowButton']"));
    }

    @Step("Кликаем на синию кнопку New Window ")
    public void blueButton_newWindow() {
        getBlueButton_newWindow().click();

    }

    private WebElement getItemAlerts() {
        return driver.findElement(By.xpath("(//*[@id='item-1'])[2]"));
    }

    @Step("Кликаем и переходим на Alerts Page ")
    public AlertsPage moveToAlertsPage() {
        getItemAlerts().click();
        return new AlertsPage(driver);

    }

    @Step("Создал метод для того, для того чтобы закрыть открывающийся вкладки  ")
    public void closeTabs() {

        ArrayList<String> switchTabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(switchTabs.get(1));
        driver.close();
        driver.switchTo().window(switchTabs.get(0));

    }


}
