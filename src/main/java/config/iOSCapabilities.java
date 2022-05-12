package config;

import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.Platform;

import java.util.HashMap;
import java.util.Map;

import static utils.AppProperties.getProperty;

public class iOSCapabilities {

    public static Map<String, Object> getCapabilities() {
        Map<String, Object> capabilitiesMap = new HashMap<>();
        capabilitiesMap.put(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
        capabilitiesMap.put(MobileCapabilityType.PLATFORM_NAME, Platform.IOS.name());
        capabilitiesMap.put(MobileCapabilityType.PLATFORM_VERSION, getProperty("appium.device.platform_version"));
        capabilitiesMap.put(MobileCapabilityType.DEVICE_NAME, getProperty("appium.device.platform_name"));
        capabilitiesMap.put(MobileCapabilityType.UDID, getProperty("appium.device.device_udid"));
        capabilitiesMap.put(IOSMobileCapabilityType.BUNDLE_ID, getProperty("ios.bundle_id"));
        capabilitiesMap.put("commandsTimeouts", 12000);
        return capabilitiesMap;
    }
}
