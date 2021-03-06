package com.ujipin.webapp1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Johnny on 15/11/6.
 */
@Controller
public class HelloController {

    @RequestMapping("/welcome")
    public ModelAndView helloWorld() {
        String message = "<br><div style='text-align:center;'>"
                + "<h3>********** Hello World, Spring MVC Tutorial</h3>This message is coming from CrunchifyHelloWorld.java **********</div><br><br>";
        return new ModelAndView("welcome", "message", message);
    }
}