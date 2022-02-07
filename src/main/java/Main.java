import helpers.AppiumServer;

public class Main {
    private static final AppiumServer appiumServer = new AppiumServer();

    public static void main(String[] args) {
        appiumServer.startAppiumServer();
        appiumServer.stopAppiumServer();
    }
}
