package Gun13;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

public class _01_WindowsGiris extends BaseDriver {  // tarayıcıdaki her bir sekmeye window adı veriliyor seleniumda

    @Test
    public void Test1(){
        driver.get("https://www.selenium.dev/");
        MyFunc.Bekle(2);

        JavascriptExecutor js=(JavascriptExecutor)driver;

        List<WebElement> linkler=driver.findElements(By.cssSelector("a[target='_blank']"));

        String anaSayfaWindowID= driver.getWindowHandle(); //bulunduğum window un İD sini ver

         for (WebElement e: linkler)
         {
             //e.click();
             js.executeScript("arguments[0].click();", e);
         }

         Set<String> windowsIDler =driver.getWindowHandles(); //bütün seklemelerin id sini ver

         for (String id: windowsIDler)
             System.out.println("id = " + id);

         MyFunc.Bekle(2);
         driver.switchTo().window(anaSayfaWindowID); // ana sayfa tabına git

         BekleKapat();
    }

}
