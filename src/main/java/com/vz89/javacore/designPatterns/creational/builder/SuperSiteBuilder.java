package main.java.com.vz89.javacore.designPatterns.creational.builder;

public class SuperSiteBuilder extends WebsiteBuilder {
    @Override
    void buildName() {
        website.setName("superSite");
    }

    @Override
    void buildCms() {
        website.setCms(Cms.WORDPRESS);
    }

    @Override
    void buildPrice() {
        website.setPrice(100);
    }
}
