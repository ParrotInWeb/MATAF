package examples;

import static utils.AppProperties.getProperty;

public class PropertyExample {

    public static void main(String[] args) {
        System.out.println("Maven compiler target is set to: " + getProperty("maven.compiler.target"));
    }
}
