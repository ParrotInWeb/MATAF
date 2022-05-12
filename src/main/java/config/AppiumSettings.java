package config;

import static utils.AppProperties.getProperty;

public class AppiumSettings {

    private static final String appiumUrl = "http://127.0.0.1:%s/wd/hub";

    public static String getAppiumUrl() {
        return String.format(appiumUrl, getProperty("appium.appiumPort"));
    }
}
