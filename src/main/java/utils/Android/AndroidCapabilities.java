package utils.Android;

import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import static utils.AppProperties.getProperty;

public class AndroidCapabilities {

    public static DesiredCapabilities getCapabilities() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("automationName", "UiAutomator2");
        capabilities.setCapability("noSign", true);
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, getProperty("appium.device.name"));
        capabilities.setCapability("udid", getProperty("appium.device.name"));
        capabilities.setCapability("platformVersion", getProperty("appium.device.platformVersion"));
        capabilities.setCapability("appPackage", getProperty("app.package"));
        capabilities.setCapability("appActivity", getProperty("app.activity"));
        capabilities.setCapability("noReset", true);
        capabilities.setCapability("clearSystemFiles", true);
        capabilities.setCapability("systemPort", Integer.parseInt(getProperty("appium.systemPort")));
        return capabilities;
    }
}
