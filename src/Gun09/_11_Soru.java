package Gun09;


//    https://www.mediamarkt.com.tr/ sayfasına gidiniz.
//    Tüm Kategoriler -> Beyaz Eşya -> Kombiler click
//    tıklatma işleminden sonra URL de
//    kombi kelimesinin geçtiğini doğrulayın.


import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class _11_Soru extends BaseDriver {

    @Test
    public void Test1(){
        driver.get("https://www.mediamarkt.com.tr/");
        Actions driverAksiyon=new Actions(driver);

        WebElement tumKategoriler=driver.findElement(By.xpath("//*[text()='Tüm Kategoriler']"));
        WebElement beyazEsya=driver.findElement(By.xpath("//*[contains(text(),'Beyaz Eşya') ]"));
        WebElement kombi=driver.findElement(By.xpath("//*[contains(text(),'Kombiler')]"));

        driverAksiyon.moveToElement(tumKategoriler).build().perform();
        MyFunc.Bekle(2);
        driverAksiyon.moveToElement(beyazEsya).build().perform();
        MyFunc.Bekle(2);

        kombi.click();

        String url=driver.getCurrentUrl();

        Assert.assertTrue("URL de kombi kelimesi bulumanadı",url.contains("kombi"));

        BekleKapat();

    }


}
