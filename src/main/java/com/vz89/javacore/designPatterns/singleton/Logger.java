package main.java.com.vz89.javacore.designPatterns.singleton;

public class Logger {
    private static Logger logger;
    private static String log="";

    private Logger() {
    }

    public static synchronized Logger getLogger() {
        if (logger == null) logger = new Logger();
        return logger;
    }

    public void addLog(String logString) {
        log += logString + "\n";
    }

    public void showLog() {
        System.out.println(log);
    }
}
