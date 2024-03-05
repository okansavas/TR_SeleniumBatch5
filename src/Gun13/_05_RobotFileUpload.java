package Gun13;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;

public class _05_RobotFileUpload extends BaseDriver {

    @Test
    public void Test1() throws AWTException {
        driver.get("https://demo.guru99.com/test/upload/");
        MyFunc.Bekle(2);

        // acceptAll
        WebElement acceptAllFrame=driver.findElement(By.id("gdpr-consent-notice"));
        driver.switchTo().frame(acceptAllFrame);

        List<WebElement> acceptAll=
                wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//span[text()='Accept All']")));

        if (acceptAll.size() > 0)
            acceptAll.get(0).click();
        /*********************/

        Robot robot = new Robot();

        for (int i = 0; i < 21; i++) {
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);
        }

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        MyFunc.Bekle(1);

        // stringi hafızaya kopyalama yöntemi
        StringSelection dosyaYolu= new StringSelection("C:\\Users\\TechnoStudy\\Desktop\\deneme.txt");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(dosyaYolu, null);
        // ctrl+C, panoya gitti, panoya kopyalandı

        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);  // ctrl+v yapıştırma

        robot.keyRelease(KeyEvent.VK_V);  // tuşlar serbest bırakıldı
        robot.keyRelease(KeyEvent.VK_CONTROL);

        MyFunc.Bekle(1);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        MyFunc.Bekle(1);
        for (int i = 0; i < 2; i++) {
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);
        }  // check box a geldim

        MyFunc.Bekle(1);
        robot.keyPress(KeyEvent.VK_SPACE);
        robot.keyRelease(KeyEvent.VK_SPACE);

        MyFunc.Bekle(1);
        for (int i = 0; i < 2; i++) {
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);
        }  // Submit butonuna geldim

        MyFunc.Bekle(1);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);  // Submit butonuna bastım

        WebElement msg=
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                           By.xpath("//*[text()='has been successfully uploaded.']")));

        Assert.assertTrue(msg.isDisplayed());

        MyFunc.Bekle(2);
        BekleKapat();
    }


}
