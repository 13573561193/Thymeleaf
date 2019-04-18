package com.hehe.config;

import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class StaticUtil{

    private static final String TEMPLATE_PREFIX = "templates/";
    private static final String TEMPLATE_SUFFIX = ".html";

    public static void makeThymeleaf(String objectName,Object objectValue,String oldFileName,String newFileName){
        try {
            ClassLoaderTemplateResolver resolver = new ClassLoaderTemplateResolver();
            resolver.setPrefix(TEMPLATE_PREFIX);
            resolver.setSuffix(TEMPLATE_SUFFIX);
            resolver.setCharacterEncoding("GBK");
            resolver.setCacheable(false);
            TemplateEngine templateEngine = new TemplateEngine();
            templateEngine.setTemplateResolver(resolver);


            //填充数据
            Context context = new Context();
            context.setVariable(objectName,objectValue);

            // 渲染模板
            FileWriter writer = new FileWriter( "d:/S/springboot-helloworld/src/main/resources/templates/"+ newFileName +".html");
            templateEngine.process(oldFileName,context,writer);
        } catch (
            IOException e) {
            e.printStackTrace();
        }

    }

}
