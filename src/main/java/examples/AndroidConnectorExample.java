package examples;

import utils.AppiumServer;
import io.appium.java_client.android.AndroidDriver;
import utils.AdbCmd;
import utils.Android.AndroidDriverConnector;

public class AndroidConnectorExample {

    public static void main(String[] args) {
        // If you already use Appium Server via Appium desktop, you do not need the internal Appium Server.
        AppiumServer.startAppiumServer();
        // If you are sure you are connected to the device, you don't need ADB utils.
        AdbCmd.connect();
        AndroidDriverConnector.connect();
        AndroidDriver androidDriver = AndroidDriverConnector.driver;
        AndroidDriverConnector.disconnect();
        AdbCmd.disconnect();
        AppiumServer.stopAppiumServer();
    }
}
