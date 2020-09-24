package main.java.com.vz89.javacore.designPatterns.abstractFactory.banking;

import main.java.com.vz89.javacore.designPatterns.abstractFactory.ProjectManager;

public class BankProjectManager implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Start manage bank project");
    }
}
