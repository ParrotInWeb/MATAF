package testnge2e;

import io.appium.java_client.AppiumDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import utils.Android.AndroidDriverConnector;

public class BaseTest {
    protected AppiumDriver androidDriver;

    @BeforeSuite
    public void beforeSuite() {
        AndroidDriverConnector.connect();
        androidDriver = AndroidDriverConnector.driver;
    }

    @AfterSuite
    public void afterSuite() {
        AndroidDriverConnector.disconnect();
    }
}
