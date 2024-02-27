package Gun10;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _03_AlertPart3 extends BaseDriver {

    @Test
    public void Test1() {
        driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");
        MyFunc.Bekle(3);

        WebElement clickMe3 = driver.findElement(By.cssSelector("button[onclick='myPromptFunction()']"));
        clickMe3.click();
        MyFunc.Bekle(2);

        String alertYazi=driver.switchTo().alert().getText();
        System.out.println("alertYazi = " + alertYazi);  // alertin yazısına ulaştım

        driver.switchTo().alert().sendKeys("ismet");  // prompt a yazı gönderdim
        driver.switchTo().alert().accept();  // OK ye bastım

        WebElement msg=driver.findElement(By.id("prompt-demo"));

        Assert.assertTrue("Girilen yazı bulunamadı=",msg.getText().contains("ismet")); // çıkan mesajı kontrol ettim

        BekleKapat();
    }


}
