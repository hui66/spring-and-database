package cn.com.gree.controller;

import cn.com.gree.entity.Users;
import cn.com.gree.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/test")
public class JdbcDemoController {

    @Autowired
    UserService userService;

    @RequestMapping("/user")
    public List<Users>  getUsers(){
        return userService.getList();
    }
}
