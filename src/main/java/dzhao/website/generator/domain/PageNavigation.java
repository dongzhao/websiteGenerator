package dzhao.website.generator.domain;

import dzhao.website.generator.annotation.TemplateInfo;

import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: Home
 * Date: 13/01/15
 * Time: 10:41 PM
 */
@TemplateInfo(resourceFrom = "navigation.ftl")
public class PageNavigation implements PageEntity{
    private Map<String, Boolean> navigationMap;

    public Map<String, Boolean> getNavigationMap() {
        return navigationMap;
    }

    public void setNavigationMap(Map<String, Boolean> navigationMap) {
        this.navigationMap = navigationMap;
    }
}
