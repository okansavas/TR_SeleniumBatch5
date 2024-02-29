package Gun12;

/*
   1-driver.get("https://chercher.tech/practice/frames"); sayfasına gidiniz.
   2-Inputa ülke adı yazınız
   3-CheckBox ı çekleyiniz.
   4-Select in 2.elemanını seçiniz.
 */

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _03_Soru extends BaseDriver {

    @Test
    public void Test1() {
        driver.get("https://chercher.tech/practice/frames");
        MyFunc.Bekle(2);

        driver.switchTo().frame(0); // ilk frame geçtim
        WebElement input=driver.findElement(By.cssSelector("#topic+input"));
        input.sendKeys("Türkiye");

        driver.switchTo().frame(0); // içerideki ilk frame
        WebElement chkBox=driver.findElement(By.id("a"));
        chkBox.click();

//        driver.switchTo().parentFrame(); // 1 geri gel  , dış frame
//        driver.switchTo().parentFrame();  // 1 geri gel,  ana sayfa

        driver.switchTo().defaultContent(); // ana sayfaya direk git

        driver.switchTo().frame(1); // ana sayafdaki 2 iframe
        WebElement webSelect=driver.findElement(By.id("animals"));
        Select nesneSelect=new Select(webSelect);
        nesneSelect.selectByIndex(1); //2.elemean

        BekleKapat();
    }

}
