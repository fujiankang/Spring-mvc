package com.xiaokang.king.RequestMtest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.ArrayList;
import java.util.List;
/**
 * Created by wb263970 on 2017/7/17.
 */

@Controller
//用于指示该类控制器，可以同时处理多个请求动作
@RequestMapping(value = "/user")
//RequestMapping可以用来注释一个控制器类，此时所有方法都将映射为类级别的请求。
//表示该控制器处理所有请求都被映射到value属性所指示的路径下
public class UserController {
    //静态List<User>集合，此处代替数据库来保存注册用户的信息
    private static List<User> userList;
    public UserController() {
        super();
        userList = new ArrayList<User>();
    }
    //静态的日志类LogFactory
    private static final Log logger = LogFactory.getLog(UserController.class);

    //方法支持GET请求
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String registerForm() {
        logger.info("register Get方法被调用");

        //跳转到注册页面
        return "registerForm";
    }
    //方法支持POST请求
    @RequestMapping(value = "/register2", method = RequestMethod.POST)
    public String registerForm(@RequestParam("loginname") String loginname, @RequestParam("password") String password,
                           @RequestParam("username") String username) {
        logger.info("register POST方法被调用");
        //创建user对象
        User user=new User();
        user.setLoginname(loginname);
        user.setPassword(password);
        user.setUsername(username);
        //模拟数据库存储
        userList.add(user);
        //跳转到登陆页面
        return "registerForm";
    }
}
