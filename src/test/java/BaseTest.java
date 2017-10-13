import com.codeborne.selenide.Configuration;
import org.junit.After;
import org.junit.Before;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;


/**
 * Created by User2 on 27.09.2017.
 */
public class BaseTest {

    @Before
    public void BeforeTest() throws Exception {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\test\\resources\\drivers\\chromedriver.exe");
        System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\src\\test\\resources\\drivers\\geckodriver.exe");
        System.setProperty("webdriver.firefox.marionette", System.getProperty("user.dir") + "\\src\\test\\resources\\drivers\\geckodriver.exe");
        System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + "\\src\\test\\resources\\drivers\\IEDriverServer.exe");
        Configuration.browser = "chrome";
        Configuration.holdBrowserOpen = true;

    }

    @After
    public void AfterTest(){

    }
}
