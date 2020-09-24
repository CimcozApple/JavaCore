package main.java.com.vz89.javacore.designPatterns.abstractFactory;

public interface ProjectTeamFactory {
    Developer getDeveloper();
    ProjectManager getProjectManager();
    Tester getTester();
}
