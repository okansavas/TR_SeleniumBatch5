package Gun12;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class _08_JavaScriptClick extends BaseDriver {

    @Test
    public void Test1() {
        driver.get("https://www.copado.com/robotic-testing");
        MyFunc.Bekle(2);

        JavascriptExecutor js=(JavascriptExecutor) driver;

        WebElement readStory=driver.findElement(By.xpath("//div[text()='Read Success Story']"));
        //readStory.click();  // sayafa önünden mouıse click
        js.executeScript("arguments[0].click();", readStory); // js click : sayfanın içinden click

        MyFunc.Bekle(3);
        BekleKapat();
    }

}
