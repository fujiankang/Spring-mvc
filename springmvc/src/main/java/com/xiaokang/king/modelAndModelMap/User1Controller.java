package com.xiaokang.king.modelAndModelMap;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by wb263970 on 2017/7/17.
 */
@Controller
public class User1Controller {
    private static final Log logger = LogFactory.getLog(User1Controller.class);

    //@ModelAttribute修饰的方法会先于login调用，该方法用于接收前台jsp页面传入的参数。
    @ModelAttribute
    public User userModel(String logginname, String password, Model model) {
        logger.info("userModel Method");
        //创建User对象存储jsp页面，传入参数。
        User user = new User();
        user.setLogginname(logginname);
        user.setPassword(password);
        model.addAttribute("user", user);
        return user;
    }

    @RequestMapping(value = "loggin1")
    public String login(Model model) {
        //从Model当中取出之前存入的名称为user的对象
        User user = (User) model.asMap().get("user");
        System.out.println("--------------------"+user);
        //设置user对象的username属性。
        user.setLogginname("测试");
        return "result";
    }

}
