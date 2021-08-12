package com.javadeveloperzone.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Lenovo on 19-07-2017.
 */
@Controller
public class SpringBootJSPExampleController {

    @GetMapping("welcome")                     // it will handle all request for /welcome
    public String SpringBootHello() {
        "welcome"        // welcome is view name. It will call welcome.jsp
    }
}
