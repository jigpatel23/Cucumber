package mol.testRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;
import mol.utilities.InitiateWebPageDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

/**
 * @author jigneshkumarpatel
 */

@CucumberOptions(
        features = "src/test/resources/mol/features/MostsharedModule.feature",
        glue = {"mol.stepDefenations", "mol.utilities"},
        monochrome = true,
        dryRun = false,
        format = {
                "pretty",
                "html:test-output/cucumber-reports",
                "rerun:test-output/cucumber-reports/rerun.txt"
        }
)
/*public class MostSharedRunner extends AbstractTestNGCucumberTests {
}
 */
public class MostSharedRunner extends InitiateWebPageDriver {
    private TestNGCucumberRunner testNGCucumberRunner;

    @BeforeClass(alwaysRun = true)
    @Parameters({"browserName", "headless"})
    public void setUpClass(String browserName, boolean headless) {
        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
        getDriverInstance(browserName, headless);
        getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        getDriver().manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        getDriver().manage().deleteAllCookies();
        getDriver().manage().window().maximize();
        getDriver().get("https://www.dailymail.co.uk");
        System.out.println(getDriver().getTitle());

    }

    //groups = "cucumber",
    @Test(description = "Runs Cucumber Feature", dataProvider = "features")
    public void feature(CucumberFeatureWrapper cucumberFeature) {
        testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
    }


    @DataProvider
    public Object[][] features() {
        return testNGCucumberRunner.provideFeatures();
    }

    @AfterClass(alwaysRun = true)
    public void tearDownClass() {
        testNGCucumberRunner.finish();
        getDriver().quit();
    }
}