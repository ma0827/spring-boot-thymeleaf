package com.example.spring_boot_thymeleaf.controller;

import com.example.spring_boot_thymeleaf.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

    @RequestMapping("user/list")
    public String userList(Model model){
        List<User> list = new ArrayList<>();
        list.add(new User("张三",18,1));
        list.add(new User("李四",23,1));
        list.add(new User("如月",21,0));
        model.addAttribute("list",list);
        return "list";
    }
}
