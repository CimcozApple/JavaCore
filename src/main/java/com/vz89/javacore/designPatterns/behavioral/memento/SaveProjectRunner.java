package main.java.com.vz89.javacore.designPatterns.behavioral.memento;

public class SaveProjectRunner {
    public static void main(String[] args) {
        Project project = new Project();
        GitHubRepository gitHubRepository = new GitHubRepository();
        System.out.println("Creating new project, Version 1.0");
        project.setVersionAndDate("Version 1");
        System.out.println(project);

        System.out.println("Saving current version to github...");
        gitHubRepository.setSave(project.save());

        project.setVersionAndDate("Version 2");

        System.out.println(project);

        project.load(gitHubRepository.getSave());

        System.out.println(project);


    }



}
