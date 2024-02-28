package Gun11;

/*
Senaryo
1-  https://www.demoblaze.com/index.html  siteyi açınız.
2- Samsung galaxy s6  linkine tıklayınız.
3- Sepete ekleyiniz.
4- Daha Sonra PRODUCT STORE yazısına tıklatarak ana ekrana geri dönününz
 */

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class _03_Soru extends BaseDriver {

    @Test
    public void Test1(){
        driver.get("https://www.demoblaze.com/index.html");
        MyFunc.Bekle(2);

        WebElement link=driver.findElement(By.linkText("Samsung galaxy s6"));
        link.click();

        WebElement sepeteEkle=driver.findElement(By.linkText("Add to cart"));
        sepeteEkle.click();

        wait.until(ExpectedConditions.alertIsPresent());//alert çıkana kadar bekle
        driver.switchTo().alert().accept();

        WebElement anaSayfa=driver.findElement(By.id("nava"));
        anaSayfa.click();

        Assert.assertTrue("Ana sayfa url si bulunamadı",
                driver.getCurrentUrl().equals("https://www.demoblaze.com/index.html"));

        BekleKapat();
    }

}
