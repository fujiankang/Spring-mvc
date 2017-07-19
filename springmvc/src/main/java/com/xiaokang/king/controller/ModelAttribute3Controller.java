package com.xiaokang.king.controller;
import com.xiaokang.king.controller.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by wb263970 on 2017/7/19.
 */
@Controller
public class ModelAttribute3Controller {
    //静态List<User>集合,此处代替数据库用来保存注册的用户信息
    private static List<User> userList;

    //构造方法
    public ModelAttribute3Controller() {
        super();
        userList = new ArrayList<User>();
        User user1 = new User("test", "123456", "测试用户");
        User user2 = new User("admin", "123456", "管理员");
        //存储User用户,用于模拟数据库数据
        userList.add(user1);
        userList.add(user2);
    }

    //根据登录名和密码查询用户,用户存在返回包含用户信息的User对象,不存在返回null
    public User find(String loginname, String password) {
        for (User user : userList) {
            if (user.getLoginname().equals(loginname) && user.getPassword().equals(password)) {
                return user;
            }
        }
        return null;
    }


    //model属性名称和值由model.addAttribute()实现,前提是要在方法中加入一个Model类型的参数
    @ModelAttribute
    public User userModel3(@RequestParam("loginname") String loginname, @RequestParam("password") String password) {
        return find(loginname, password);
    }

    @RequestMapping(value = "/login3")
    public String login3() {
        return "result3";
    }
}
