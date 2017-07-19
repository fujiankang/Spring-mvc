package com.xiaokang.king.controller;

import com.xiaokang.king.controller.models.User;
import com.xiaokang.king.controller.models.UserModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by wb263970 on 2017/7/19.
 */
@Controller
public class ModelAttribute5Controller {
    //model属性名称就是value值,即user,model属性对象就是方法的返回值.

    @ModelAttribute("user")
    public void userModel5(@RequestParam("loginname") String loginname, @RequestParam("password") String password) {
        UserModel user = new UserModel();
        user.setUsername(loginname);
        user.setPassword(password);
    }

    @RequestMapping(value = "/login5")
    public String login5(@ModelAttribute("user") UserModel user) {
        user.setUsername("管理员");
        return "result5";
    }
}
