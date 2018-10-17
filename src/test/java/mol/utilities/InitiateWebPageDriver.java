package mol.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

/**
 * @author jignesh
 *
 */
public class InitiateWebPageDriver  {
    private static ThreadLocal<WebDriver> threadDriver = new ThreadLocal<WebDriver>();

    public WebDriver getDriver() {
        WebDriver driver = threadDriver.get();
        return driver;
    }
    public static void getDriverInstance(String browserName, boolean headless){
    if(browserName.equalsIgnoreCase("chrome")) {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setAcceptInsecureCerts(true);
        options.addArguments("disable-infobars");
        options.setHeadless(headless);
        threadDriver.set(new ChromeDriver(options));

    }else if(browserName.equalsIgnoreCase("firefox")){
        System.setProperty(FirefoxDriver.SystemProperty.DRIVER_USE_MARIONETTE, "true");
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\Drivers\\geckodriver.exe");
        FirefoxOptions options = new FirefoxOptions();
        options.setAcceptInsecureCerts(true);
        options.setHeadless(headless);
        threadDriver.set(new FirefoxDriver(options));
    }


    }



}
