package Gun09;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class _03_ActionDoubleClickTest extends BaseDriver {

    @Test
    public void test1(){
        driver.get("https://demoqa.com/buttons");

        MyFunc.Bekle(2);
        List<WebElement> consent=driver.findElements(By.xpath("//p[text()='Consent']"));
        if (consent.size()>0)
            consent.get(0).click();

        WebElement btnDblClick=driver.findElement(By.id("doubleClickBtn"));
        MyFunc.Bekle(2);

        Actions aksiyonDriver=new Actions(driver);
        Action aksyion=aksiyonDriver.moveToElement(btnDblClick).doubleClick().build();
        aksyion.perform();

        //new Actions(driver).doubleClick(btnDblClick).build().perform();

        BekleKapat();
    }

}
