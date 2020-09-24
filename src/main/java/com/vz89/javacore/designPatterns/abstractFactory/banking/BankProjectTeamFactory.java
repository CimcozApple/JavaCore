package main.java.com.vz89.javacore.designPatterns.abstractFactory.banking;

import main.java.com.vz89.javacore.designPatterns.abstractFactory.Developer;
import main.java.com.vz89.javacore.designPatterns.abstractFactory.ProjectManager;
import main.java.com.vz89.javacore.designPatterns.abstractFactory.ProjectTeamFactory;
import main.java.com.vz89.javacore.designPatterns.abstractFactory.Tester;

public class BankProjectTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new BankProjectManager();
    }

    @Override
    public Tester getTester() {
        return new BankTester();
    }
}
