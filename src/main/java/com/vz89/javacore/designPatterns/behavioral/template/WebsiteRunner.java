package main.java.com.vz89.javacore.designPatterns.behavioral.template;

public class WebsiteRunner {
    public static void main(String[] args) {
        WebsiteTemplate websiteTemplate = new NewsPage();
        WebsiteTemplate websiteTemplate1 = new WelcomePage();

        websiteTemplate.showPage();
        websiteTemplate1.showPage();
    }
}
