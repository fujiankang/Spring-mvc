package com.xiaokang.king.annotation;

import com.xiaokang.king.RequestMtest.User;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

/**
 * Created by wb263970 on 2017/7/18.
 */
//Controller注解用于指示该类的一个控制器,可以同时处理多个请求动作
@Controller //将Model中的属性名为user的属性放入HttpSession对象当中
//@SessionAttributes(types = {User.class},value="user")
//设置多个
@SessionAttributes(types = {User.class,String.class },value={"user","hello"})

public class SessionAttributesController {
    //静态日志LogFactory
    private static final Log logger = LogFactory.getLog(SessionAttributesController.class);
    @RequestMapping(value = "/{formName}")
    public String loginForm(@PathVariable String formName) {
        //动态跳转页面
        return formName;
    }

    //处理映射请求的方法
    @RequestMapping(value = "loginatt")
    public String login(@RequestParam("loginname") String loginname, @RequestParam("password") String password, Model model){
    //创建User对象,装载用户信息
        User user=new User();
        user.setLoginname(loginname);
        user.setPassword(password);
        user.setUsername("admin");
        model.addAttribute("user",user);
        return "welcome";
    }
}
