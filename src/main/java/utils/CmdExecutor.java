package utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class CmdExecutor {

    public static Process execCmd(String cmd, String... param) {
        String formattedCmd = String.format(cmd, (Object[]) param);
        try {
            System.out.println("Execute: '" + formattedCmd + "'");
            return Runtime.getRuntime().exec(formattedCmd);
        } catch (IOException e) {
            return null;
        }
    }

    public static String execCmdWithGetResult(String cmd, String... param) {
        try {
            Process commandResult = execCmd(cmd, param);
            BufferedReader bufferedReader = getResult(commandResult);
            return joinLinesOfResult(bufferedReader);
        } catch (IOException ex) {
            return "";
        }
    }

    private static BufferedReader getResult(Process commandResult) {
        if (commandResult != null) {
            return new BufferedReader(new InputStreamReader(commandResult.getInputStream()));
        } else {
            throw new NullPointerException("There is no result");
        }
    }

    private static String joinLinesOfResult(BufferedReader bufferedReader) throws IOException {
        String s;
        LinkedList<String> sl = new LinkedList<>();
        while ((s = bufferedReader.readLine()) != null) {
            sl.add(s);
        }
        return String.join(" ", sl);
    }
}
