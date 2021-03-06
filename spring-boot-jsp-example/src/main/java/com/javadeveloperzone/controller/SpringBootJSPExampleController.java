package com.javadeveloperzone.controller;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;

import org.springframework.context.annotation.Profile;

/**
 * Created by Lenovo on 19-07-2017.
 */


@Controller
public class SpringBootJSPExampleController {

    @RequestMapping("/welcome") // it will handle all request for /welcome
    public String SpringBootHello() {
         return "welcome";  // welcome is view name. It will call welcome.jsp
    }
public static void main(String[] args) {
        SpringApplication.run(SpringBootJSPExampleController.class, args);
    }
}
