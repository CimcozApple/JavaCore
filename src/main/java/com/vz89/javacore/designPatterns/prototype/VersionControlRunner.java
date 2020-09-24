package main.java.com.vz89.javacore.designPatterns.prototype;

public class VersionControlRunner {
    public static void main(String[] args) {
        Project master = new Project(1,"abc","sourcedode");
        System.out.println(master);

        ProjectFactory projectFactory = new ProjectFactory(master);

        Project masterClone = projectFactory.cloneProject();
    }
}
