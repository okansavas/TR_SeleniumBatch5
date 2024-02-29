package Gun11;

/*
    Senaryo:
    https://google.com/ da selenium kelimesini aratınız.
    ilk çıkan sonuca tıklatıp,(selenium)
    çıkan URL yi ekrana yazdırınız.
    Beklenen url https://www.selenium.dev/  olduğunu doğrulayınız
 */

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.security.Key;
import java.util.List;

public class _04_Soru extends BaseDriver {

    @Test
    public void Test1() {
        driver.get("https://www.google.com/");
        MyFunc.Bekle(2);

        List<WebElement> consent = driver.findElements(By.xpath("//button[@id='L2AGLb']/div"));
        if (consent.size() > 0)
            consent.get(0).click();

        WebElement srcBox=driver.findElement(By.name("q"));
        srcBox.sendKeys("Selenium"+ Keys.ENTER); // \n \r  gibi

//        WebElement srcBtn=driver.findElement(By.name("btnK"));
//        srcBtn.click();

        ////a[@href="https://www.selenium.dev/"]     [href='https://www.selenium.dev/'] css
        WebElement seleniumLink=driver.findElement(By.xpath("//cite[text()='https://www.selenium.dev']"));
        seleniumLink.click();

        wait.until(ExpectedConditions.urlToBe("https://www.selenium.dev/")); //titleContains("Selenium")

        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());
        Assert.assertTrue("Sayfaya ulaşılamadı.",
                driver.getCurrentUrl().equals("https://www.selenium.dev/"));  //https://www.selenium.dev/

        BekleKapat();
    }

}
