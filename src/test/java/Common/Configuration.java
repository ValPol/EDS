package Common;

import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;

public class Configuration {
   public  static WebDriver driver;

    public WebDriver SetDrivers(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Documents\\GitHub\\ЭДО\\EDS\\src\\test\\resources\\drivers\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addExtensions(new File("C:\\Users\\admin\\Documents\\GitHub\\ЭДО\\EDS\\src\\test\\resources\\drivers\\CryptoProExt.crx"));
        options.addArguments("--start-maximized");
     //   System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\src\\test\\resources\\drivers\\geckodriver.exe");
       // System.setProperty("webdriver.firefox.marionette", System.getProperty("user.dir") + "\\src\\test\\resources\\drivers\\geckodriver.exe");
       // System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + "\\src\\test\\resources\\drivers\\IEDriverServer.exe")
        com.codeborne.selenide.Configuration.browser = "chrome";
        com.codeborne.selenide.Configuration.holdBrowserOpen = true;
        driver = new ChromeDriver(options);
        WebDriverRunner.setWebDriver(driver);
        return driver;
    }

   /* public boolean isAlertPresent()
    {
        try
        {
            driver.switchTo().alert();
            return true;
        }   // try
        catch (NoAlertPresentException Ex)
        {
            return false;
        }   // catch
    }   // isAlertPresent()*/

}