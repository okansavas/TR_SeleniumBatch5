package Gun09;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class _10_ActionTusKontrolSendKeys extends BaseDriver {

    @Test
    public void Test1() {

        driver.get("https://demoqa.com/auto-complete");

        MyFunc.Bekle(2);
        List<WebElement> consent=driver.findElements(By.xpath("//p[text()='Consent']"));
        if (consent.size()>0)
            consent.get(0).click();

        WebElement txtBox=driver.findElement(By.id("autoCompleteSingleInput"));
        MyFunc.Bekle(3);

        // txtBox a git, içine tıklat, b hrfine bas, aşağı yön tuşuna bas, enter a bas.
        Actions driverAksiyon=new Actions(driver);

        driverAksiyon
                .moveToElement(txtBox)
                .click()
                .sendKeys("b")
                .build()
                .perform();

        MyFunc.Bekle(2); //tuşa basıldığında seçeneklerin çıkması için bir süre gerekiyor

        driverAksiyon
                .sendKeys(Keys.DOWN)
                .sendKeys(Keys.ENTER)
                .build()
                .perform();

        BekleKapat();
    }

}
