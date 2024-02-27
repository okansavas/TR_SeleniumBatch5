package Gun10;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _02_AlertPart2 extends BaseDriver {

    @Test
    public void Test1() {
        driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");
        MyFunc.Bekle(3);

        WebElement clickMe2=driver.findElement(By.cssSelector("button[onclick='myConfirmFunction()']"));
        clickMe2.click();

        MyFunc.Bekle(2);
        // alert açıldı
        driver.switchTo().alert().dismiss(); // cancel e bas.

       BekleKapat();
    }
}
