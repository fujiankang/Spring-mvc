package com.xiaokang.king.modelAndModelMap;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by wb263970 on 2017/7/17.
 */
@Controller
public class User2Controller {
    private static final Log logger = LogFactory.getLog(User2Controller.class);

    //@ModelAttribute修饰的方法会先于login调用，该方法用于接收前台jsp页面传入的参数。
    @ModelAttribute
    public User userModel(String logginname, String password, ModelMap modelMap) {
        logger.info("userModel Method");
        //创建User对象存储jsp页面，传入参数。
        User user2 = new User();
        user2.setLogginname(logginname);
        user2.setPassword(password);
        modelMap.addAttribute("user", user2);
        return user2;
    }

    @RequestMapping(value = "loggin2")
    public String login(ModelMap modelMap) {
        logger.info("login2");
        //从Model当中取出之前存入的名称为user的对象
        User user = (User) modelMap.get("user");
        System.out.println("--------------------"+user);
        //设置user对象的username属性。
        user.setLogginname("测试User2");
        return "result2";
    }

}
