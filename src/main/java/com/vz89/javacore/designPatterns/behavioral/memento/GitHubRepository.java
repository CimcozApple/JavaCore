package main.java.com.vz89.javacore.designPatterns.behavioral.memento;

public class GitHubRepository {
    private Save save;

    public Save getSave() {
        return save;
    }

    public void setSave(Save save) {
        this.save = save;
    }
}
