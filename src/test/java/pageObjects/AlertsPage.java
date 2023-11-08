package pageObjects;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class AlertsPage extends BasePage{


    public AlertsPage(WebDriver driver) {
    super(driver);
    }

    private WebElement getBlueAlertButton() {
        return driver.findElement(By.xpath("//*[@id='alertButton']"));
    }
@Step("Кликаем на кнопку Alerts")
    public void clickAlertButton() {
        getBlueAlertButton().click();

    }
    @Step("Использовал этот метод при открытии вклдаки, чтобы нажать OK")
    public void alertButton_closeTheSubWindow() {
        driver.switchTo().alert().accept();

    }

    private WebElement getBlueTimerAlertButton() {
        return driver.findElement(By.xpath("//*[@id='timerAlertButton']"));
    }
@Step("Здесь кликнул на кнопку Timer Alert и поставил Thread.sleep,потому что не нашел других вариантов дождаться открытия вклдаки  ")
    public void clickTimerAlertButton() throws InterruptedException {
        getBlueTimerAlertButton().click();
        Thread.sleep(5000);

    }
    private WebElement getBlueConfirmAlertButton() {
        return driver.findElement(By.xpath("//*[@id='confirmButton']"));}

    @Step("Нажал на кнопку Confirm Alert")
    public void clickConfirmAlertButton()  {
      getBlueConfirmAlertButton().click();


    }


    @Step("С помощью этого метод проверил,что открывается текст You selected Ok")
    public boolean openText() {
        By resultsLocator=By.xpath("//*[@id='confirmResult']");
        try{
            wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(resultsLocator));
            return true;
        }catch (TimeoutException ignored){
            return false;
        }
    }
    private WebElement getBluePromtAlertButton() {
        return driver.findElement(By.xpath("//*[@id='promtButton']"));}


    @Step("Нажал на кнопку Promt Alert")
    public void clickPromtAlertButton()  {
        getBluePromtAlertButton().click();

    }
    @Step("Здесь я написал текст и использовал другой метод, чтобы закрыть вклдаку")
    public void alertButton_enterTextAndCloseSubWindow(String stringText) {
        driver.switchTo().alert().sendKeys(stringText);
        alertButton_closeTheSubWindow();



    }

    @Step("С помощью этого метод проверил,что открывается текст You entered Test name")
    public boolean openText1() {
        By resultsLocator=By.xpath("//*[@id='promptResult']");
        try{
            wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(resultsLocator));
            return true;
        }catch (TimeoutException ignored){
            return false;
        }
    }
}






