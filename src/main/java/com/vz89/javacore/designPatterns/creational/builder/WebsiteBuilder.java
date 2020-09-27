package main.java.com.vz89.javacore.designPatterns.creational.builder;

public abstract class WebsiteBuilder {
    Website website;

    void createWebsite() {
        website = new Website();
    }

    public Website getWebsite() {
        return website;
    }

    abstract void buildName();
    abstract void buildCms();
    abstract void buildPrice();
}
