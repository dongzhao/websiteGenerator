package dzhao.website.generator.domain;

/**
 * Created with IntelliJ IDEA.
 * User: Home
 * Date: 13/01/15
 * Time: 11:56 PM
 * To change this template use File | Settings | File Templates.
 */
public interface Page extends PageEntity{
    public String getHeader();

    public void setHeader(String header);

    public String getNavigation();

    public void setNavigation(String navigation);

    public String getFooter();

    public void setFooter(String footer) ;
}
