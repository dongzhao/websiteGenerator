package dzhao.website.generator.domain;

import dzhao.website.generator.annotation.TemplateInfo;
import dzhao.website.generator.annotation.TemplateItemInfo;

@TemplateInfo(
        resourceFrom = "index.ftl",
        output = "index.html",
        mainTemplate = true)
public class MainPage implements Page{
    @TemplateItemInfo(clazz = PageHeader.class)
    private String header;
    @TemplateItemInfo(clazz = PageNavigation.class)
    private String navigation ;
    @TemplateItemInfo(clazz = PageFooter.class)
    private String footer;
    @TemplateItemInfo(clazz = PageSlideshow.class)
    private String slider;
    @TemplateItemInfo(clazz = HomeContent.class)
    private String homeContent;

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getNavigation() {
        return navigation;
    }

    public void setNavigation(String navigation) {
        this.navigation = navigation;
    }

    public String getFooter() {
        return footer;
    }

    public void setFooter(String footer) {
        this.footer = footer;
    }

    public String getSlider() {
        return slider;
    }

    public void setSlider(String slider) {
        this.slider = slider;
    }

    public String getHomeContent() {
        return homeContent;
    }

    public void setHomeContent(String homeContent) {
        this.homeContent = homeContent;
    }
}
