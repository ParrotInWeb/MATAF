package config;

import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.Platform;

import java.util.HashMap;
import java.util.Map;

import static utils.AppProperties.getProperty;

public class AndroidCapabilities {

    public static Map<String, Object> getCapabilities() {
        Map<String, Object> capabilitiesMap = new HashMap<>();
        capabilitiesMap.put(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);
        capabilitiesMap.put(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID.name());
        capabilitiesMap.put(MobileCapabilityType.PLATFORM_VERSION, getProperty("appium.device.platform_version"));
        capabilitiesMap.put(MobileCapabilityType.DEVICE_NAME, getProperty("appium.device.platform_name"));
        capabilitiesMap.put(MobileCapabilityType.UDID, getProperty("appium.device.device_udid"));
        capabilitiesMap.put(MobileCapabilityType.NO_RESET, true);
        capabilitiesMap.put(AndroidMobileCapabilityType.APP_ACTIVITY, getProperty("android.app_activity"));
        capabilitiesMap.put(AndroidMobileCapabilityType.APP_PACKAGE, getProperty("adnroid.app_package"));
        capabilitiesMap.put(AndroidMobileCapabilityType.NO_SIGN, true);
        capabilitiesMap.put(AndroidMobileCapabilityType.DEVICE_READY_TIMEOUT, 5000);
        return capabilitiesMap;
    }
}
