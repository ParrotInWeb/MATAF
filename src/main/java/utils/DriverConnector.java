package utils;

import config.AndroidCapabilities;
import config.AppiumSettings;
import config.iOSCapabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.NoSuchSessionException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import static utils.CapabilityUtils.setCapabilities;

public class DriverConnector {
    public static AppiumDriver<WebElement> driver = null;
    private static final Logger logger = LogManager.getLogger(DriverConnector.class);

    public static void connect(String platformName) {
        try {
            if (platformName.equalsIgnoreCase("ios")) {
                driver = new IOSDriver<>(new URL(AppiumSettings.getAppiumUrl()), setCapabilities(iOSCapabilities.getCapabilities()));
            } else if (platformName.equalsIgnoreCase("android")) {
                driver = new AndroidDriver<>(new URL(AppiumSettings.getAppiumUrl()), setCapabilities(AndroidCapabilities.getCapabilities()));
            } else {
                throw new WebDriverException("Incorrect platform name");
            }

        } catch (MalformedURLException e) {
            logger.error(e::getMessage);
        }
    }

    public static void disconnect() {
        try {
            driver.quit();
        } catch (NoSuchSessionException ex) {
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            try {
                driver.quit();
            } catch (NoSuchSessionException ignored) {
            }
        }
    }
}
