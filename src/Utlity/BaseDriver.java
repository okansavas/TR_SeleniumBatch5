package Utlity;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.logging.Level;
import java.util.logging.Logger;

public class BaseDriver {
    public static WebDriver driver;
    public static void DriverBaslat(){
        driver=new ChromeDriver();

    }




    public static void BekleKapat(){
        MyFunc.Bekle(3);
        driver.quit();
    }
}
