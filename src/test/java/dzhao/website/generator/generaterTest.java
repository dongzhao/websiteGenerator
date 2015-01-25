package dzhao.website.generator;

import dzhao.website.generator.annotation.TemplateInfo;
import dzhao.website.generator.annotation.TemplateItemInfo;
import dzhao.website.generator.domain.*;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import junit.framework.Assert;
import org.junit.Test;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Home
 * Date: 11/01/15
 * Time: 11:10 PM
 */
public class generaterTest {

    @Test
    public void can_generate_index_page() throws IllegalAccessException, TemplateException, IOException {
        MainPage mainPage = new MainPage();

        //age header
        PageHeader pageHeader = new PageHeader();
        pageHeader.setLogoName("my_logo.jpg");
        pageHeader.setUserName("dzhao");
        pageHeader.setDomainName("gmail.com");

        PageNavigation pageNavigation = new PageNavigation();
        pageNavigation.setNavigationMap(new HashMap<String, Boolean>(){
            {
                put("Home", true);
                put("Products", false);
                put("Services", false);
                put("Contact Us", false);
                put("About Us", false);
            }
        });

        PageSlideshow pageSlideshow = new PageSlideshow();
        pageSlideshow.setSlideImageInfo(new HashMap<String, String>() {
            {
                put("1.jpg", "my test pic 1;");
                put("2.jpg", "my test pic 2;");
                put("3.jpg", "my test pic 3;");
                put("4.jpg", "my test pic 4;");
                put("5.jpg", "my test pic 5;");
            }
        });

        HomeContent pageHomeContent = new HomeContent();
        pageHomeContent.setDescription(
                "We offer a service that you will not find elsewhere in the Wollongong Area.");
        pageHomeContent.setTitle("Welcome to My Website");

        ImageUrlLinkInfo info1 = new ImageUrlLinkInfo();
        info1.setNavigationName("products");
        info1.setImageName("shipping_small.jpg");
        info1.setImageHeight(164);
        info1.setImageWidth(198);

        ImageUrlLinkInfo info2 = new ImageUrlLinkInfo();
        info2.setNavigationName("services");
        info2.setImageName("services_small.jpg");
        info2.setImageHeight(164);
        info2.setImageWidth(198);

        ImageUrlLinkInfo info3 = new ImageUrlLinkInfo();
        info3.setNavigationName("about-us");
        info3.setImageName("about-us_small.jpg");
        info3.setImageHeight(164);
        info3.setImageWidth(198);

        pageHomeContent.setImageInfos(Arrays.asList(info1, info2, info3));

        PageFooter pageFooter = new PageFooter();

        List objects = new ArrayList<Object>();
        objects.add(mainPage);
        objects.add(pageHeader);
        objects.add(pageNavigation);
        objects.add(pageFooter);
        objects.add(pageSlideshow);
        objects.add(pageHomeContent);

        FreeMarkerWriter writer = new FreeMarkerWriter(objects);
        writer.write();

    }

/*    @Test
    public void test() throws IllegalAccessException {
        MainPage mainPage = new MainPage();
        PageHeader pageHeader = new PageHeader();
        PageNavigation pageNavigation = new PageNavigation();
        PageFooter pageFooter = new PageFooter();
        List objects = new ArrayList<Object>();
        objects.add(mainPage);
        objects.add(pageHeader);
        objects.add(pageNavigation);
        objects.add(pageFooter);
        setValue(objects);
        Assert.assertNotNull(mainPage);
    }*/

/*    private void setValue(List<Object> objectList) throws IllegalAccessException {
        Object mainObject = null;
        for (Object obj : objectList){
            TemplateInfo templateInfo = obj.getClass().getAnnotation(TemplateInfo.class);
            if(templateInfo.mainTemplate()){
                mainObject = obj;
                break;
            }
        }

        //Page mainPage = (Page)mainObject;
        for (Object obj : objectList){
            TemplateInfo templateInfo = obj.getClass().getAnnotation(TemplateInfo.class);
            if(templateInfo.mainTemplate()){
                continue;
            }
            String templateUrl = ClassLoader.getSystemResource(templateInfo.resourceFrom()).getPath();

            for(Field field : mainObject.getClass().getDeclaredFields()){
                TemplateItemInfo templateItemInfo = field.getAnnotation(TemplateItemInfo.class);
                if(templateItemInfo.clazz().isInstance(obj)){
                    field.setAccessible(true);
                    field.set(mainObject, "test1");
                    field.setAccessible(false);
                    break;
                }
            }
        }

    }*/
}
