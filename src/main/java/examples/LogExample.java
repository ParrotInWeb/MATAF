package examples;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LogExample {
    private static final Logger logger = LogManager.getLogger(LogExample.class);

    public static void main(String[] args) {
        logger.debug("Some debug log!");
        logger.error("Some error log!", new NullPointerException("NullError"));
        logger.info("Some info log!");
    }
}
