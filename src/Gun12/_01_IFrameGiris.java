package Gun12;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_IFrameGiris extends BaseDriver {

    @Test
    public void Test1(){
        driver.get("https://chercher.tech/practice/frames");
        MyFunc.Bekle(2);

        //driver.switchTo().frame(0); // index ile geçmek sırasına göre geçilebilir
        //driver.switchTo().frame("frame1"); // id sine göre geçilebilir
        //driver.switchTo().frame("iamframe"); // name ine göre geçilebilir

        WebElement weFrame1=driver.findElement(By.id("frame1")); // webElement olarak da geçilebilir
        driver.switchTo().frame(weFrame1);
        //index>webelement>name>id

        WebElement txtBox=driver.findElement(By.cssSelector("[id='topic']+input"));
        txtBox.sendKeys("Türkiye");

        driver.switchTo().defaultContent();  // otomatik olarak ana sayafa düşersin, en dışa
        //driver.switchTo().parentFrame(); // bir önceki yere dön

        BekleKapat();
    }

}
