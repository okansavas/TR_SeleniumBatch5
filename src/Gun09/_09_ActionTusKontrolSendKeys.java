package Gun09;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class _09_ActionTusKontrolSendKeys extends BaseDriver {

    @Test
    public void test1(){
        driver.get("https://demoqa.com/auto-complete");

        MyFunc.Bekle(2);
        List<WebElement> consent=driver.findElements(By.xpath("//p[text()='Consent']"));
        if (consent.size()>0)
            consent.get(0).click();

        WebElement txtBox=driver.findElement(By.id("autoCompleteMultipleInput"));
        MyFunc.Bekle(3);

        new Actions(driver)
                .moveToElement(txtBox)// kutucuğa git
                .click()              // yazabilmek için içine tıklat
                .keyDown(Keys.SHIFT) // shift tuşuna bas
                .sendKeys("a")       // a harfini gönder büyük A yazmalı shift tne dolayı
                .keyUp(Keys.SHIFT)   // shift tuşunu geri bırak
                .sendKeys("hmet")    // hmet yazısını gönder küçük harflerle yazmalı
                .build()             // aksiyonu hazırla
                .perform();          // işlemi gerçekleştir.

        BekleKapat();
    }


}
