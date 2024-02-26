package Gun09;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class _07_DragAndDropBy extends BaseDriver {

    @Test
    public void test1(){
        driver.get("http://talkerscode.com/webtricks/demo/demo_price-range-slider-using-jquery-css-and-php.php");

        MyFunc.Bekle(2);
        List<WebElement> consent=driver.findElements(By.xpath("//p[text()='Consent']"));
        if (consent.size()>0)
            consent.get(0).click();

        Actions driveraksiyon=new Actions(driver);

        WebElement solSurgu=driver.findElement(By.xpath("//div[@id='slider-range']/span[1]"));
        MyFunc.Bekle(2);

        //dragAndDropBy(WebElement,X , Y) x: yatay yönde, y: dikey yönde
        Action aksiyon=driveraksiyon.dragAndDropBy(solSurgu, 100, 0).build();
        aksiyon.perform();
        // + değer girdiğimizde sağa dogru, - değer girdiğimizde sola dogru kaydırıyor

        BekleKapat();
        //TODO :sol sürgü 200$ , sağ sürgüyü 400$ a getiriniz.
        //int genislik=cubuk.getSize().width;  // 500$
    }


}
