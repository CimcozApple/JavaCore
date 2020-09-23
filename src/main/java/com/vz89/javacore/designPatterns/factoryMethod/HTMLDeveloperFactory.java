package main.java.com.vz89.javacore.designPatterns.factoryMethod;

public class HTMLDeveloperFactory implements DeveloperFactory {

    @Override
    public Developer createDeveloper() {
        return new HtmlDeveloper();
    }
}
