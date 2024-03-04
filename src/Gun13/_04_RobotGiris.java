package Gun13;

/*
   Interview Sorusu

   Windows pencerelerini nasıl kontrol edersin.
   ROBOT Class la kontrol ederim.
 */

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;

public class _04_RobotGiris extends BaseDriver {

    @Test
    public void Test1() throws AWTException {
        driver.get("https://www.selenium.dev/");
        MyFunc.Bekle(2);

        //Klavyeden ctrl+tab a basarak yeni bir sekme açıp, başka sayfa çağıralım.
        // Bunu bu sefer ROBOT class la yapalım
        Robot robot=new Robot();

        //Yeni pencere açalım
        robot.keyPress(KeyEvent.VK_CONTROL); // ctrl bas, şu an artık basılı durumda
        robot.keyPress(KeyEvent.VK_T);   // ctrl basılı idi, T harfine bastım
        robot.keyRelease(KeyEvent.VK_T);  // T tuşunu bırak
        robot.keyRelease(KeyEvent.VK_CONTROL); // CTRL tuşunu bırak
        MyFunc.Bekle(2);// burada yeni sayfanın açılmış ve hazır olması için bekleme kondu

        // şimdi 2.sayfanın id sini bulup ona geçip yeni sayfayı çağıralım
        Set<String> idler=driver.getWindowHandles();
        Iterator gosterge= idler.iterator(); // idlerin baş tarafına konumlan.
        String birinciSekmeId= gosterge.next().toString(); // ilk penrenin id sini aldım
        String ikinciSekmeId= gosterge.next().toString(); // ikinci penrenin id sini aldım

        MyFunc.Bekle(2);
        driver.switchTo().window(ikinciSekmeId);
        driver.get("https://www.facebook.com/");

        MyFunc.Bekle(2);
        BekleKapat();
    }


}
