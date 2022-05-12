package examples;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import utils.AppProperties;
import utils.AppiumServer;
import io.appium.java_client.android.AndroidDriver;
import utils.AdbCmd;
import utils.DriverConnector;

public class AndroidConnectorExample {

    public static void main(String[] args) {
        // If you already use Appium Server via Appium desktop, you do not need the internal Appium Server.
        AppiumServer.startAppiumServer();
        // If you are sure you are connected to the device, you don't need ADB utils.
        AdbCmd.connect();
        DriverConnector.connect(AppProperties.getProperty("appium.device.platform_name"));
        AppiumDriver<WebElement> driver = DriverConnector.driver;
        DriverConnector.disconnect();
        AdbCmd.disconnect();
        AppiumServer.stopAppiumServer();
    }
}
