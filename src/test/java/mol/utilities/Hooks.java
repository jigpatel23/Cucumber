package mol.utilities;

import cucumber.api.java.After;
import cucumber.api.java.Before;

/**
 * @author jignesh
 */

public class Hooks extends InitiateWebPageDriver {


    @Before
    public void setup() {
        System.out.println("before scenario");

         //   Chromes(browserName);

      /*  ChromeOptions options = new ChromeOptions();
        options.setAcceptInsecureCerts(true);
        options.addArguments("disable-infobars");
        options.setHeadless(false);
        // WebDriver driver = new ChromeDriver(options);/*
        getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        getDriver().manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        getDriver().manage().deleteAllCookies();
        getDriver().manage().window().maximize();
        getDriver().get("https://www.dailymail.co.uk");
        */
    }

    @After
    public void tearDown() {
        System.out.println("after");
//        getDriver().quit();
    }


}
