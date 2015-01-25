package dzhao.website.generator;

import dzhao.website.generator.annotation.TemplateInfo;
import dzhao.website.generator.annotation.TemplateItemInfo;
import freemarker.cache.FileTemplateLoader;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

import java.io.*;
import java.lang.reflect.Field;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: dzhao
 * Date: 4/11/14
 * Time: 9:56 PM
 */
public class FreeMarkerWriter {
/*    private final String templateUrl;
    private final Object input;
    private final String targetUrl;*/
    private final List<Object> objectList;

    public FreeMarkerWriter(List<Object> objectList){
        this.objectList = objectList;
    }

    public void write() throws IOException, TemplateException, IllegalAccessException {
        Configuration cfg = new Configuration();
        Object mainObject = null;
        String mainTemplateUrl = null;
        String targetUrl = null;
        for (Object obj : objectList){
            TemplateInfo templateInfo = obj.getClass().getAnnotation(TemplateInfo.class);
            if(templateInfo.mainTemplate()){
                mainObject = obj;
                mainTemplateUrl = templateInfo.resourceFrom();
                targetUrl = templateInfo.output();
                break;
            }
        }

        String templatePath = getParentPath(ClassLoader.getSystemResource(mainTemplateUrl).getPath());
        FileTemplateLoader templateLoader = new FileTemplateLoader(new File(templatePath));
        cfg.setTemplateLoader(templateLoader);
        for (Object obj : objectList){
            TemplateInfo templateInfo = obj.getClass().getAnnotation(TemplateInfo.class);
            if(templateInfo.mainTemplate()){
                continue;
            }
            //String templateUrl = ClassLoader.getSystemResource(templateInfo.resourceFrom()).getPath();
            Template template = cfg.getTemplate(templateInfo.resourceFrom());
            Writer writer = new StringWriter();
            template.process(obj, writer);

            for(Field field : mainObject.getClass().getDeclaredFields()){
                TemplateItemInfo templateItemInfo = field.getAnnotation(TemplateItemInfo.class);
                if(templateItemInfo.clazz().isInstance(obj)){
                    field.setAccessible(true);
                    field.set(mainObject, writer.toString());
                    field.setAccessible(false);
                    break;
                }
            }
        }

        Template template = cfg.getTemplate(mainTemplateUrl);
        FileWriter writer = null;
        File file = new File(templatePath + "\\" + targetUrl);
        //file.getParentFile().mkdirs();
        try {
            file.createNewFile();
            writer = new FileWriter(file);
            if (template != null) {
                try {
                    template.process(mainObject, writer);
                } catch (TemplateException e) {
                    e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
                }
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }

    private static String getParentPath(String filePath){
        File file = new File(filePath);
        if(!file.exists())
            throw new RuntimeException("The file doesn't exist by [" +filePath+ "]");
        return file.getParent();
    }

}
