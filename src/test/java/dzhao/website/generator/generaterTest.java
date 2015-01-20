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

        PageFooter pageFooter = new PageFooter();
        List objects = new ArrayList<Object>();
        objects.add(mainPage);
        objects.add(pageHeader);
        objects.add(pageNavigation);
        objects.add(pageFooter);

        FreeMarkerWriter writer = new FreeMarkerWriter(objects);
        writer.write();

    }

    @Test
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
    }

    private void setValue(List<Object> objectList) throws IllegalAccessException {
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

    }
}
