package main.java.com.vz89.javacore.designPatterns.creational.factoryMethod;

public class JavaDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }
}
