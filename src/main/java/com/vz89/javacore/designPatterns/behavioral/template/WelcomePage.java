package main.java.com.vz89.javacore.designPatterns.behavioral.template;

public class WelcomePage extends WebsiteTemplate {

    @Override
    public void showPageContent() {
        System.out.println("Hello");
    }
}
