package main.java.com.vz89.javacore.designPatterns.behavioral.visitor;

public interface Developer {
    public void create(ProjectClass projectClass);
    public void create(Database database);
    public void create(Test test);
}
