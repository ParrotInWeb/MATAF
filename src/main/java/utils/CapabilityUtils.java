package utils;

import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.Map;

public class CapabilityUtils {

    public static DesiredCapabilities setCapabilities(Map<String, Object> capabilitesMap) {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        capabilitesMap.forEach(desiredCapabilities::setCapability);
        return desiredCapabilities;
    }
}
