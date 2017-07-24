package com.example.ctrl;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * Created by tsk on 2017/7/18.
 */
@RestController
public class HelloCtrl {
    @RequestMapping("/welcome/{name}")
    public String sayWelcome(@PathVariable("name") String name, HttpSession session){
        session.setAttribute("name",name);
        return "Welcome "+name +"!";

    }
}
