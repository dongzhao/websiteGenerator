package dzhao.website.generator.domain;

import dzhao.website.generator.annotation.TemplateInfo;

import java.util.Map;

@TemplateInfo(resourceFrom = "slide_show.ftl")
public class PageSlideshow implements PageEntity{
    /**
     * Key:     slide image name
     * value:   image information
     */
    private Map<String, String> slideImageInfo;

    public Map<String, String> getSlideImageInfo() {
        return slideImageInfo;
    }

    public void setSlideImageInfo(Map<String, String> slideImageInfo) {
        this.slideImageInfo = slideImageInfo;
    }
}
