package utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class CmdExecutor {
    private static final Logger logger = LogManager.getLogger(CmdExecutor.class);

    public static Process execCmd(String cmd, String... param) {
        String formattedCmd = String.format(cmd, (Object[]) param);
        Process result = null;
        try {
            logger.info("Execute: '" + formattedCmd + "'");
            result = Runtime.getRuntime().exec(formattedCmd);
        } catch (IOException ex) {
            logger.error(ex::getMessage);
        }
        return result;
    }

    public static String getResult(Process cmdResult) {
        String result = "";
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(cmdResult.getInputStream()));
            result = toOneLineString(bufferedReader);
        } catch (IOException ex) {
            logger.error(ex::getMessage);
        }
        return result;
    }

    private static String toOneLineString(BufferedReader bufferedReader) throws IOException {
        String line;
        LinkedList<String> lines = new LinkedList<>();
        while ((line = bufferedReader.readLine()) != null) {
            lines.add(line);
        }
        return String.join(" ", lines);
    }
}
