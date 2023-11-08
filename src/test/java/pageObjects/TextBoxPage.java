package pageObjects;


import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class TextBoxPage extends BasePage {


    public TextBoxPage(WebDriver driver) {
        super(driver);
    }


    private WebElement getFullNameField() {
        return driver.findElement(By.cssSelector("[id='userName']"));
    }

    private WebElement getEmailField() {
        return driver.findElement(By.id("userEmail"));
    }

    private WebElement getCurrentAddress() {
        return driver.findElement(By.cssSelector("[placeholder='Current Address']"));
    }

    private WebElement getPermanentAddress() {
        return driver.findElement(By.xpath("//*[@id='permanentAddress']"));
    }

    private WebElement getSubmitButton() {
        return driver.findElement(By.id("submit"));
    }

    @Step("Заполняем поля и кликаем на кнопку Summit")
    public void fillInTheField(String username, String email, String currentAddr, String permanentAddr) {
        getFullNameField().sendKeys(username);
        getEmailField().sendKeys(email);
        getCurrentAddress().sendKeys(currentAddr);
        getPermanentAddress().sendKeys(permanentAddr);
        getSubmitButton().click();
    }

    @Step("Проверяем что данные сохранены корректо, с помощью открытия блока ")
    public boolean openBlock() {
        By blockLocator = By.xpath("//*[@class='border col-md-12 col-sm-12']");
        try {
            wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(blockLocator));
            return true;
        } catch (TimeoutException ignored) {
            return false;
        }
    }

    private WebElement getButtonsFind() {
        return driver.findElement(By.xpath("(//*[@id='item-4'])[1]"));
    }

    @Step("Кликаем на Buttons и переходим на новую страницу Buttons")
    public ButtonsPage moveToButtonsPage() {
        getButtonsFind().click();
        return new ButtonsPage(driver);
    }

}



