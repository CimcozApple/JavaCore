package main.java.com.vz89.javacore.designPatterns.creational.abstractFactory;

public interface ProjectTeamFactory {
    Developer getDeveloper();
    ProjectManager getProjectManager();
    Tester getTester();
}
