package Gun14;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class _01_EkranKaydet extends BaseDriver {

    @Test
    public void Test1() throws IOException {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        MyFunc.Bekle(2);

        // kendinize kod yazıyortsanız.
        driver.findElement(By.name("username")).sendKeys("ismet");
        driver.findElement(By.name("password")).sendKeys("1234");

        WebElement submit = driver.findElement(By.cssSelector("button[type='submit']"));
        submit.click();

        List<WebElement> errorMsg=driver.findElements(By.xpath("//*[text()='Invalid credentials']"));
        if (errorMsg.size()>0){ // hata olmuş demektir, ekran kaydı alalım
            System.out.println("Hata oldu");

            //ekranı kaydet
            TakesScreenshot ts=(TakesScreenshot) driver;  // aynı js gibi
            File hafizadakiHali= ts.getScreenshotAs(OutputType.FILE); // ekran kaydı aldı dosya
            // formatında ama hafıda duruyor.

            FileUtils.copyFile(hafizadakiHali, new File("ekranGoruntuler\\screenshot.jpg")); // zaman bilgisi
            //Şu anda hazıfzadaki görüntüyü dosya olarak kaydetti.  2024_04_05_13:56

            // TODO :  Öyle bir şey yapınki her ekran kaydı , AYRI AYRI kaydedilsin.
        }


        BekleKapat();
    }


}
