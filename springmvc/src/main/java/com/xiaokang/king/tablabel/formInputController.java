package com.xiaokang.king.tablabel;

import com.xiaokang.king.tablabel.JavaBean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by wb263970 on 2017/7/21.
 */
@Controller
public class formInputController {
    @RequestMapping(value = "/registerForm", method = RequestMethod.GET)
    public String FormInputController(Model model) {
        User user = new User(1,"付健康","男",31,"hao123.com","毛泽东是共产的领路人");
        //model中添加command,值是user对象.
//        model.addAttribute("command",user);
        model.addAttribute("user",user);
        return "formtest";
    }
}
