package examples;

import utils.cmd.CmdExecutor;

public class CmdExecutorExample {

    public static void main(String[] args) {
        String res = CmdExecutor.execCmdWithGetResult("adb devices");
        System.out.println(res);
    }
}
