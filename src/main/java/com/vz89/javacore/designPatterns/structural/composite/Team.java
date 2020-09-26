package main.java.com.vz89.javacore.designPatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private List<Developer> developerList = new ArrayList<Developer>();

    public void addDeveloper(Developer developer) {
        developerList.add(developer);
    }

    public void removeDeveloper(Developer developer) {
        developerList.remove(developer);
    }

    public void createProject() {
        for (Developer developer : developerList) {
            developer.writeCode();
        }
    }
}

