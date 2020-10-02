package main.java.com.vz89.javacore.designPatterns.behavioral.template;

public class NewsPage extends WebsiteTemplate {

    @Override
    public void showPageContent() {
        System.out.println("News");
    }
}
