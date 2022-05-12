package cucumberRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import utils.AppProperties;
import utils.DriverConnector;

@CucumberOptions(
        features = "src/test/resources/features/FirstTestOnAndroid.feature",
        glue = {"stepDefinitions"},
        plugin = {"pretty"}
)
public class Runner extends AbstractTestNGCucumberTests {

    @BeforeSuite(alwaysRun = true)
    public void beforeSuite() {
        DriverConnector.connect(AppProperties.getProperty("appium.device.platform_name"));
    }

    @AfterSuite(alwaysRun = true)
    public void afterSuite() {
        DriverConnector.disconnect();
    }
}
