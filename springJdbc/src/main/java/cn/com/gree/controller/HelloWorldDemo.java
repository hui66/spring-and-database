package cn.com.gree.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldDemo {

    @RequestMapping("/hello")
    public String helloTest(){
        return "hello springboot";
    }
}
