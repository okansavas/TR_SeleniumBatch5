package Gun09;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class _08_ActionMouseWheel extends BaseDriver {
    // mousun döner topu (Whell) kaydırma

    @Test
    public void test1()
    {
        driver.get("https://www.selenium.dev/selenium/web/scrolling_tests/frame_with_nested_scrolling_frame_out_of_view.html");
        WebElement iframe=driver.findElement(By.name("nested_scrolling_frame"));

        MyFunc.Bekle(3);
        // iframe isimli webElemnte kadar scroll yap
        new Actions(driver).
                scrollToElement(iframe).
                build().
                perform();

        BekleKapat();
    }

    @Test
    public void test2()
    {
        driver.get("https://www.selenium.dev/selenium/web/scrolling_tests/frame_with_nested_scrolling_frame_out_of_view.html");

        MyFunc.Bekle(3);
        // belli bir miktar pixel kadar scroll
        new Actions(driver).
                scrollByAmount(0,500).
                build().
                perform();

        BekleKapat();
    }

    @Test
    public void test3()
    {

    }

}
