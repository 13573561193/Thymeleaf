package com.hehe.web;

import com.hehe.config.StaticUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;

import java.io.FileWriter;
import java.io.IOException;

@Controller
public class ThyController {

    private static final String TEMPLATE_PREFIX = "templates/";
    private static final String TEMPLATE_SUFFIX = ".html";
    @RequestMapping("/index")
    public String index(){
//        StaticUtil staticUtil = new StaticUtil();
//        staticUtil.makeThymeleaf("name","小ming明","index","index_static_111");
//        return "index_static_111";


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
            context.setVariable("name","小ming明");

            // 渲染模板
            FileWriter writer = new FileWriter( "d:/S/springboot-helloworld/src/main/resources/templates/index_static.html");
            templateEngine.process("index",context,writer);
        } catch (
                IOException e) {
            e.printStackTrace();
        }
        return "index_static";

    }

}
