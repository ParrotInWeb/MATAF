import helpers.AppiumServer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    private static final AppiumServer appiumServer = new AppiumServer();
    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        logger.error("Some error");
    }
}
