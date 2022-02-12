package utils.Android;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.NoSuchSessionException;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import static utils.AppProperties.getProperty;

public class AndroidDriverConnector {
    public static AndroidDriver<AndroidElement> driver;
    private static final Logger logger = LogManager.getLogger(AndroidDriverConnector.class);

    public static void connect() {
        String appiumUrl = String.format("http://127.0.0.1:%s/wd/hub", getProperty("appium.appiumPort"));
        try {
            driver = new AndroidDriver<>(
                    new URL(appiumUrl),
                    AndroidCapabilities.getCapabilities());
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
