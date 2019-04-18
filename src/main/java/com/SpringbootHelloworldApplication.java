package com;

import com.hehe.bean.User;
import com.hehe.config.StaticUtil;
import com.hehe.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;
import java.util.List;

@SpringBootApplication
public class SpringbootHelloworldApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootHelloworldApplication.class, args);

        //Thymeleaf
//        UserService userService = new UserService();
//        List<User> usersInfo = userService.testAllUsers();
//        long date1 = new Date().getTime();
//        StaticUtil staticUtil = new StaticUtil();
//        staticUtil.makeThymeleaf("usersInfo",usersInfo,"testThymeleaf","testThymeleaf_static");
//        long date2 = new Date().getTime();
//        System.out.println("静态化过程耗时：" + (date2-date1));

    }


}
