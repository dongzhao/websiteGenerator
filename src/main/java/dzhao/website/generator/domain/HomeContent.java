package dzhao.website.generator.domain;

import dzhao.website.generator.annotation.TemplateInfo;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Dong Zhao
 * Date: 25/01/15
 * Time: 5:11 PM
 */
@TemplateInfo(resourceFrom = "home_content.ftl")
public class HomeContent implements PageEntity{
    private String title;
    private String description;
    private List<ImageUrlLinkInfo> imageInfos;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<ImageUrlLinkInfo> getImageInfos() {
        return imageInfos;
    }

    public void setImageInfos(List<ImageUrlLinkInfo> imageInfos) {
        this.imageInfos = imageInfos;
    }
}
