package main.java.com.vz89.javacore.designPatterns.creational.abstractFactory.banking;

import main.java.com.vz89.javacore.designPatterns.creational.abstractFactory.ProjectManager;

public class BankProjectManager implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Start manage bank project");
    }
}
