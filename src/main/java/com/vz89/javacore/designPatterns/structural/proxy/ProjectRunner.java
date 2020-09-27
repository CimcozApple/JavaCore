package main.java.com.vz89.javacore.designPatterns.structural.proxy;

public class ProjectRunner {
    public static void main(String[] args) {
        Project project = new ProxyProject("www.url.com/project") {
        };
        project.run();
    }
}
