package dzhao.website.generator.domain;

import dzhao.website.generator.annotation.TemplateInfo;

/**
 * Created with IntelliJ IDEA.
 * User: Home
 * Date: 13/01/15
 * Time: 10:34 PM
 */
@TemplateInfo(resourceFrom = "header.ftl")
public class PageHeader implements PageEntity{
    private String logoName;
    private String userName;
    private String domainName;

    public String getLogoName() {
        return logoName;
    }

    public void setLogoName(String logoName) {
        this.logoName = logoName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }
}
