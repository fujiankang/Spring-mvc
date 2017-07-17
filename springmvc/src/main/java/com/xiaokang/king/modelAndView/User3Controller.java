package com.xiaokang.king.modelAndView;
import com.xiaokang.king.modelAndModelMap.User;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
/**
 * Created by wb263970 on 2017/7/17.
 */
@Controller
public class User3Controller {
    private static final Log logger = LogFactory.getLog(User3Controller.class);
    @ModelAttribute
    public void userModel(String logginname, String password, ModelAndView mv) {
        logger.info("userModel 3");
        //创建User对象存储jsp页面，传入参数。
        User user3 = new User();
        user3.setLogginname(logginname);
        user3.setPassword(password);
        mv.addObject("user3",user3);
    }
    @RequestMapping(value = "loggin3")
    public ModelAndView login3(ModelAndView mv){
        logger.info("login3");
        //从modelAndView的model当中取出之前存入的名为user3的对象
        User user=(User) mv.getModel().get("user3");
        System.out.println(user);
        //设置user对象的username属性。
        user.setLogginname("user3root");
        //设置返回的视图名称
        mv.setViewName("result3");
        return mv;
    }
}
