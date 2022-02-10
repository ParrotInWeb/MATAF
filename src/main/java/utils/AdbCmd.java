package utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.concurrent.TimeUnit;

import static org.awaitility.Awaitility.await;
import static utils.CmdExecutor.execCmd;
import static utils.CmdExecutor.getResult;

public class AdbCmd {

    private static final String appiumDevice = AppProperties.getProperty("appium.device");
    private static final Logger logger = LogManager.getLogger(AdbCmd.class);

    public static void connect() {
        await("Wait until device " + appiumDevice + " is connected")
                .atMost(60, TimeUnit.SECONDS)
                .pollInterval(5, TimeUnit.SECONDS)
                .until(() -> {
                    String deviceList = connectToDevice();
                    if (deviceList.contains(appiumDevice + "offline")) {
                        logger.error("Device " + appiumDevice + " is offline. Try to reconnect");
                        disconnect();
                    }
                    return deviceList.contains(appiumDevice + "device");
                });
    }

    private static String connectToDevice() {
        if (appiumDevice.contains(".")) {
            execCmd("adb connect " + appiumDevice);
        }
        return getResult(execCmd("adb devices"))
                .replaceAll("[ \t\n]", "");
    }

    public static void disconnect() {
        execCmd("adb disconnect " + appiumDevice);
    }
}
