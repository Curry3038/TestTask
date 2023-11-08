package pageObjects;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementsPage extends BasePage {

    public ElementsPage(WebDriver driver) {

        super(driver);
    }

    private WebElement getTextBoxFind() {
        return driver.findElement(By.xpath("(//*[@id='item-0'])[1]"));
    }

    @Step("Нажимаем на  Text Box  и переходим на страничку Text Box")
    public TextBoxPage moveToTextBoxPage() {
        getTextBoxFind().click();
        return new TextBoxPage(driver);
    }
}
