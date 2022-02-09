package examples;

import utils.CmdExecutor;

import static utils.CmdExecutor.getResult;

public class CmdExecutorExample {

    public static void main(String[] args) {
        Process res = CmdExecutor.execCmd("adb is");
        System.out.println(getResult(res));
    }
}
