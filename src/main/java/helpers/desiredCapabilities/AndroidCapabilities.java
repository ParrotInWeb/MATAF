package helpers.desiredCapabilities;

import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import utils.AppProperties;

public class AndroidCapabilities {

    public static DesiredCapabilities getCapabilities() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("automationName", "UiAutomator2");
        capabilities.setCapability("noSign", true);
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, AppProperties.getProperty("appium.device.name"));
        capabilities.setCapability("udid", AppProperties.getProperty("appium.device.name"));
        capabilities.setCapability("platformVersion", AppProperties.getProperty("appium.device.platformVersion"));
        capabilities.setCapability("appPackage", AppProperties.getProperty("app.package"));
        capabilities.setCapability("appActivity", AppProperties.getProperty("app.activity"));
        capabilities.setCapability("newCommandTimeout", 60);
        capabilities.setCapability("language", "app.languageCode");
        capabilities.setCapability("locale", "app.countryCode");
        capabilities.setCapability("noReset", true);
        capabilities.setCapability("clearSystemFiles", true);
        capabilities.setCapability("systemPort", AppProperties.getProperty("appium.systemPort"));
        return capabilities;
    }
}
