package main.java.com.vz89.javacore.designPatterns.abstractFactory;

import main.java.com.vz89.javacore.designPatterns.abstractFactory.banking.BankProjectTeamFactory;

public class SuperBank {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new BankProjectTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        ProjectManager projectManager = projectTeamFactory.getProjectManager();
        Tester tester = projectTeamFactory.getTester();

        developer.writeCode();
        projectManager.manageProject();
        tester.testing();
    }
}
