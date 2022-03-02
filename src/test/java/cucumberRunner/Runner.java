package cucumberRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import utils.Android.AndroidDriverConnector;

@CucumberOptions(
        features = "src/test/resources/features/FirstTestOnAndroid.feature",
        glue = {"stepDefinitions"},
        plugin = {"pretty"}
)
public class Runner extends AbstractTestNGCucumberTests {

    @BeforeSuite(alwaysRun = true)
    public void beforeSuite() {
        AndroidDriverConnector.connect();
    }

    @AfterSuite(alwaysRun = true)
    public void afterSuite() {
        AndroidDriverConnector.disconnect();
    }
}
