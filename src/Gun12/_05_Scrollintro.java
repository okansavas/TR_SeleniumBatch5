package Gun12;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;

public class _05_Scrollintro extends BaseDriver {

    @Test
    public void Test1(){
        driver.get("https://www.selenium.dev/selenium/web/scrolling_tests/frame_with_nested_scrolling_frame_out_of_view.html");
        MyFunc.Bekle(2);

        //Actions driverAksiyon=new Actions(driver);
        JavascriptExecutor js=(JavascriptExecutor) driver;

        js.executeScript("window.scrollTo(0,500)");  // dikey yönde 500 pixel baştan kaydır


        MyFunc.Bekle(2);
        js.executeScript("window.scrollBy(0,500)"); // bulunduğu yerde 500 scroll


        MyFunc.Bekle(2);
        js.executeScript("window.scrollBy(0,-200)"); // bulunduğu yerde 200 geri scroll


        BekleKapat();
    }


}
