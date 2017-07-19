package com.xiaokang.king.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by wb263970 on 2017/7/19.
 */
@Controller
public class ModelAttribute2Controller {
    //model属性名称和值由model.addAttribute()实现,前提是要在方法中加入一个Model类型的参数
    @ModelAttribute
    public void userModel2(@RequestParam("loginname") String loginname, @RequestParam("password") String password, Model model) {
        model.addAttribute("loginname", loginname);
        model.addAttribute("password", password);
    }

    @RequestMapping(value = "/login2")
    public String login2() {
        return "result2";
    }
}
