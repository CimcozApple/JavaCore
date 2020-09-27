package main.java.com.vz89.javacore.designPatterns.creational.abstractFactory.banking;

import main.java.com.vz89.javacore.designPatterns.creational.abstractFactory.Developer;
import main.java.com.vz89.javacore.designPatterns.creational.abstractFactory.ProjectManager;
import main.java.com.vz89.javacore.designPatterns.creational.abstractFactory.ProjectTeamFactory;
import main.java.com.vz89.javacore.designPatterns.creational.abstractFactory.Tester;

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
