package main.java.com.vz89.javacore.designPatterns.builder;

public class EpicSiteBuilder extends WebsiteBuilder {

    @Override
    void buildName() {
        website.setName("epic");
    }

    @Override
    void buildCms() {
        website.setCms(Cms.ALIFRESCO);
    }

    @Override
    void buildPrice() {
        website.setPrice(1000);
    }
}
