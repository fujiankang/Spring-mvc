package com.xiaokang.king.controller;


import com.xiaokang.king.controller.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created by wb263970 on 2017/7/19.
 */
@Controller
public class ModelAttribute4Controller {
    // login4方法返回值并不是一个视图名称,而是model属性的值,视图名称@RequestMapping的value值"/login4"
    //Model的属性名称由@ModelAttribute(value="")指定,相当于request中封装了username(key)=admin(value)
    //注意jsp的名称和请求的RequestMapping,value名称一样
    @RequestMapping(value = "/login4")
    @ModelAttribute(value = "username")
    public String login4() {
        return "admin";
    }
}
