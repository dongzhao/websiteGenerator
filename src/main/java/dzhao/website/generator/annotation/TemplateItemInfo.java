package dzhao.website.generator.annotation;

import dzhao.website.generator.domain.PageEntity;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface TemplateItemInfo {
    Class<? extends PageEntity> clazz() default PageEntity.class;
}
