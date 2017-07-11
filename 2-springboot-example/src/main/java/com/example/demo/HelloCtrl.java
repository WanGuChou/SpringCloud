package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by tsk on 2017/7/11.
 */
@RestController
public class HelloCtrl {
    @RequestMapping("/hello")
    public String  index(String name){
        return "hello ,"+name+"!!";
    }
}
