package main.java.com.vz89.javacore.designPatterns.singleton;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger();

        logger.addLog("123");
        logger.addLog("123");
        logger.addLog("123");
        logger.addLog("123");
        logger.addLog("123");

        logger.showLog();
    }
}
