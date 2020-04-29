package com.hehe.web;

import com.hehe.bean.User;
import com.hehe.config.StaticUtil;
import com.hehe.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.File;
import java.util.Date;
import java.util.List;


@Controller
public class UserController {
    @Autowired
    private UserService userService;
    private static final String TEMPLATE_PREFIX = "templates/";
    private static final String TEMPLATE_SUFFIX = ".html";

/*    @RequestMapping("/showOneUser")
    public String showOneUser(Model model) {
        User user = userService.findOneUser();
//        model.addAttribute("userInfo",user);
//        return "showOneUser";

//        try {
//            ClassLoaderTemplateResolver resolver = new ClassLoaderTemplateResolver();
//            resolver.setPrefix(TEMPLATE_PREFIX);
//            resolver.setSuffix(TEMPLATE_SUFFIX);
//            resolver.setCharacterEncoding("GBK");
//            resolver.setCacheable(false);
//            TemplateEngine templateEngine = new TemplateEngine();
//            templateEngine.setTemplateResolver(resolver);
//
//            //填充数据
//            Context context = new Context();
//            context.setVariable("userInfo", user);
//
//            // 渲染模板
//            FileWriter writer = new FileWriter("d:/S/springboot-helloworld/src/main/resources/templates/showOneUser_static.html");
//            templateEngine.process("showOneUser", context, writer);
//        } catch (
//                IOException e) {
//            e.printStackTrace();
//        }
//        return "showOneUser_static";

        StaticUtil staticUtil = new StaticUtil();
        staticUtil.makeThymeleaf("userInfo",user,"showOneUser","showOneUser_static");
        return "showOneUser_static";

    }*/

/*    @RequestMapping("/showAllUsers")
    public String showAllUsers(Model model){
        List<User> usersInfo = userService.findAllUsers();
//        model.addAttribute("usersInfo",usersInfo);
//        return "showAllUsers";

        StaticUtil staticUtil = new StaticUtil();
        staticUtil.makeThymeleaf("usersInfo",usersInfo,"showAllUsers","showAllUsers_static");
        return "showAllUsers_static";
    }*/


    /**
     * 静态化页面生成速度测试
     * 数据量在UserService.testAllUsers()方法  修改for循环次数
     * @return
     */
    @RequestMapping("/testThymeleaf")
    public String testThymeleaf(){
        List<User> usersInfo = userService.testAllUsers();
        //文件路径修改为你当前项目所在路径
        File file = new File("D:\\work\\Thymeleaf\\src\\main\\resources\\templates\\testThymeleaf_static.html");
        long date1 = new Date().getTime();
        if(!file.exists()){
            StaticUtil staticUtil = new StaticUtil();
            staticUtil.makeThymeleaf("usersInfo",usersInfo,"testThymeleaf", file);
            long date2 = new Date().getTime();
            System.out.println("数据量：" + usersInfo.size() + "条,静态化过程耗时：" + (date2-date1));
            return "testThymeleaf_static";
        }else{
            return "testThymeleaf_static";
        }

    }
}
