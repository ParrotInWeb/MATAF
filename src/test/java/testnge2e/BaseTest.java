package testnge2e;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import utils.DriverConnector;

import static utils.AppProperties.getProperty;

public class BaseTest {
    protected AppiumDriver<WebElement> driver;

    @BeforeSuite
    public void beforeSuite() {
        DriverConnector.connect(getProperty("appium.device.platform_name"));
        driver = DriverConnector.driver;
    }

    @AfterSuite
    public void afterSuite() {
        DriverConnector.disconnect();
    }
}
