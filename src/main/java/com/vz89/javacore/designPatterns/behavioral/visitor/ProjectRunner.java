package main.java.com.vz89.javacore.designPatterns.behavioral.visitor;

public class ProjectRunner {
    public static void main(String[] args) {
        Project project = new Project();

        Developer junior = new JuniorDeveloper();
        Developer senior = new SeniorDeveloper();
        project.beWritten(junior);

        project.beWritten(senior);
    }
}
