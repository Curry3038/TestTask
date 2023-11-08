package pageObjects;

import io.qameta.allure.Step;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class ButtonsPage extends BasePage {


    public ButtonsPage(WebDriver driver) {
        super(driver);
    }

    private WebElement getButton_clickMe() {
        By clickMeLocator = By.xpath("//*[text()='Click Me']");
        wait.until(ExpectedConditions.elementToBeClickable(clickMeLocator));
        return driver.findElement(clickMeLocator);
    }

    @Step("Нажимаем на кнопку Click me")
    public void clickOnTheButton_clickMe() {
        getButton_clickMe().click();
    }

    @Step("Проверяем,что повился текст-You have done a dynamic click")
    public boolean isOpen() {
        By locator = By.xpath("//*[text()='You have done a dynamic click']");
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            return true;
        } catch (TimeoutException xx) {
            return false;
        }
    }

    private WebElement getButton_rightClickMe() {
        return driver.findElement(By.xpath("//*[text()='Right Click Me']"));


    }

    @Step("Нажимаем на кнопку  Right Click me")
    public void clickOnTheButton_rightClickMe() {
        Actions actions = new Actions(driver);
        actions.contextClick(getButton_rightClickMe()).perform();
    }

    @Step("Проверяем,что повился текст-You have done a right click")
    public boolean isOpen1() {
        By locator = By.xpath("//*[text()='You have done a right click']");
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            return true;
        } catch (TimeoutException xx) {
            return false;
        }
    }

    private WebElement getButton_doubleClickMe() {
        return driver.findElement(By.xpath("//*[text()='Double Click Me']"));
    }

    @Step("Нажимаем на кнопку  Double Click ")
    public void clickOnTheButton_doubleClickMe() {
        Actions actions = new Actions(driver);
        actions.doubleClick(getButton_doubleClickMe()).perform();

    }

    @Step("Проверяем,что повился текст-You have done a double click")
    public boolean isOpen2() {
        By locator = By.xpath("//*[text()='You have done a double click']");
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            return true;
        } catch (TimeoutException xx) {
            return false;
        }
    }

    private WebElement getClickButton_alertsFrameWindows() {
        return driver.findElement(By.xpath("(//*[@class='header-text'])[3]"));
    }


    @Step("Нажимаем на вкладку Аlerts Frame Windows")
    public void clickButton_alertsFrameWindows() {
        getClickButton_alertsFrameWindows().click();
    }

    private WebElement getClickButton_browserWindows() {
        return driver.findElement(By.xpath("//*[text()='Browser Windows']"));
    }

    @Step("Переходим на страницу Browser Windows и для этого прокручиваем вниз до вкладки  ")
    public BrowserWindowsPage moveToBrowserWindowsPage() {
        WebElement browser_windows = getClickButton_browserWindows();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", browser_windows);

        getClickButton_browserWindows().click();

        return new BrowserWindowsPage(driver);


    }


}

