package Gun11;

/*
        Bu siteye gidiniz.  http://demo.seleniumeasy.com/ajax-form-submit-demo.html
        Name giriniz.
        Comment giriniz.
        Submit'e tıklayınız.
        Form submited Successfully! yazısı görüntülenmelidir.
        assert ile kontrol ediniz
        (xpath kullanmayınız)
 */

import Utlity.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class _02_Soru extends BaseDriver {

    @Test
    public void Test1() {
        driver.get("http://demo.seleniumeasy.com/ajax-form-submit-demo.html");

        WebElement title = driver.findElement(By.id("title"));
        title.sendKeys("müşteri memnuniyeti");

        WebElement description = driver.findElement(By.id("description"));
        description.sendKeys("Yeni aldığım ürün oldukça oldukça iyi çıktı, teşekkür ederiz.");


        WebElement submit = driver.findElement(By.id("btn-submit"));
        submit.click();

        //WebElement msg= driver.findElement(By.xpath("//*[text()='Form submited Successfully!']"));

        wait.until(ExpectedConditions.textToBe(By.id("submit-control"), "Form submited Successfully!"));
        WebElement mesaj = driver.findElement(By.id("submit-control"));

        Assert.assertTrue("Aranılan mesaj bulunamadı", mesaj.getText().equals("Form submited Successfully!"));

        BekleKapat();
    }


}
