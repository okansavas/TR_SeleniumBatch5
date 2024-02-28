package Gun11;

import Utlity.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class _01_ExplicitWait extends BaseDriver {

    @Test
    public void test1()
    {
        // element var ama tıklanabilir olana kadar beklemem gereken durumlar
        // element var ama içine yazı gönderilebilr durumda değil
        // alert in gözükmesini bekle
        // url beklediğin olana kadar bekle

        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");

        WebElement btn=driver.findElement(By.xpath("//button[@onclick='timedText()']"));
        btn.click();

        WebElement msg=driver.findElement(By.id("demo"));
        // Bu locator ın görünen yazısı bu olana kadar bekle

        WebDriverWait bekle=new WebDriverWait(driver, Duration.ofSeconds(20));

        bekle.until(ExpectedConditions.textToBe(By.id("demo"), "WebDriver"));
        //text i bu olana kadar bekle

        System.out.println("msg.getText() = " + msg.getText()); // WebDriver

        BekleKapat();
    }


}
