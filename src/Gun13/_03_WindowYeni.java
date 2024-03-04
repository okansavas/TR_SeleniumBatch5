package Gun13;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.WindowType;

public class _03_WindowYeni extends BaseDriver {

    @Test
    public void Test1(){
        driver.get("https://www.selenium.dev/");
        MyFunc.Bekle(2);

        driver.switchTo().newWindow(WindowType.TAB);  // yeni BOŞ sekme açar.
        // yeni açılan tab da  https://www.facebook.com/  nasıl çağırırız?
        // açılan yeni tabda olduğumdan sadece driver.get ile yeni sayfayı açtırabilirim.
        driver.get("https://www.facebook.com/");

        MyFunc.Bekle(2);
        BekleKapat();
    }

}
