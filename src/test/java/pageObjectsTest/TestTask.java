package pageObjectsTest;

;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.*;



public class TestTask extends BaseTest {


     @Test
    public void testInterview() throws InterruptedException {
//        Переход на стрaничку элементы
        MainPage mainPage = new MainPage(driver);
        mainPage.open(url);
        ElementsPage elementsPage = mainPage.moveToElementsPage();
//       Переход на старницу Text Box
        TextBoxPage textBoxPage = elementsPage.moveToTextBoxPage();
//        Заполнить поля в Text Box и  Нажать на кнопку «Submit»
        String username = faker.name().fullName();
        String currentAddr = faker.address().fullAddress();
        String permanetAddr = faker.address().fullAddress();
        textBoxPage.fillInTheField(username, "dvorchuk99@bk.ru", currentAddr, permanetAddr);
//     Проверить, что данные в блоке сохранены корректно
        Assert.assertTrue(textBoxPage.openBlock());
//        Нажать на «Buttons»
        ButtonsPage buttonsPage = textBoxPage.moveToButtonsPage();
//        Нажать на кнопку «Click me»
        buttonsPage.clickOnTheButton_clickMe();
//        Проверить, что появился текст «You have done a dynamic click»
        Assert.assertTrue(buttonsPage.isOpen());
//        Нажать на кнопку «Right Click me»
        buttonsPage.clickOnTheButton_rightClickMe();
//        Проверить, что появился текст «You have done a right click»
        Assert.assertTrue(buttonsPage.isOpen1());
//        Нажать на кнопку «Double Click me»
        buttonsPage.clickOnTheButton_doubleClickMe();
//        Проверить, что появился текст «You have done a double click»
        Assert.assertTrue(buttonsPage.isOpen2());
//        Нажать на «Alerts, Frame &amp; Windows»
        buttonsPage.clickButton_alertsFrameWindows();
//        Нажать на «Browser Windows»
        BrowserWindowsPage browserWindowsPage = buttonsPage.moveToBrowserWindowsPage();
//        Нажать на кнопку «New Tab»
        browserWindowsPage.BlueButton_newTab();
//        Закрыть новую вкладку
        browserWindowsPage.closeTabs();
//     Нажать на кнопку «New window»
        browserWindowsPage.blueButton_newWindow();
//        Закрыть новое окно
        browserWindowsPage.closeTabs();

//        Нажать на «Alerts»
        AlertsPage alertsPage = browserWindowsPage.moveToAlertsPage();
//        Нажать на кнопку «Click me» рядом с Click Button to see alert
        alertsPage.clickAlertButton();
//        Закрыть уведомление
        alertsPage.alertButton_closeTheSubWindow();
//        Нажать на кнопку «Click me» рядом с On button click, alert will appear after 5  seconds
        alertsPage.clickTimerAlertButton();
//        Закрыть уведомление
        alertsPage.alertButton_closeTheSubWindow();
//        Нажать на кнопку «Click me» рядом с On button click, confirm box will appear
       alertsPage.clickConfirmAlertButton();
//        Нажать на кнопку «Да» в уведомление
       alertsPage.alertButton_closeTheSubWindow();
//        Проверить, что появился текст You selected Ok
        Assert.assertTrue(alertsPage.openText());
//        Нажать на кнопку «Click me» рядом с On button click, prompt box will appear
        alertsPage.clickPromtAlertButton();
//        Заполнить поле в уведомление данными: Test name
        alertsPage.alertButton_enterTextAndCloseSubWindow("Text name");
//        Проверить, что появился текст You entered: Test name
        Assert.assertTrue(alertsPage.openText1());










    }


}
