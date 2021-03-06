package utils;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.AndroidServerFlag;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

import java.io.File;

import static utils.AppProperties.getProperty;

public class AppiumServer {

    private static AppiumDriverLocalService service;

    public static void startAppiumServer() {
        service = new AppiumServiceBuilder()
                .withArgument(GeneralServerFlag.SESSION_OVERRIDE)
                .withArgument(AndroidServerFlag.SUPPRESS_ADB_KILL_SERVER)
                .usingPort(Integer.parseInt(getProperty("appium.appiumPort")))
                .withArgument(AndroidServerFlag.BOOTSTRAP_PORT_NUMBER, getProperty("appium.bootstrapPort"))
                .withArgument(GeneralServerFlag.LOG_LEVEL, getProperty("appium.log-level"))
//                    .withArgument(GeneralServerFlag.LOG_LEVEL, "debug")
                .usingDriverExecutable(new File(getProperty("appium.path.nodeJs")))
                .withAppiumJS(new File(getProperty("appium.path.mainJs")))
                .build();
        service.start();
    }

    public static void stopAppiumServer() {
        service.stop();
    }
}
