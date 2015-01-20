package dzhao.website.generator.domain;

import dzhao.website.generator.annotation.TemplateInfo;
import dzhao.website.generator.annotation.TemplateItemInfo;

/**
 * Created with IntelliJ IDEA.
 * User: Home
 * Date: 13/01/15
 * Time: 10:38 PM
 */
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
}
