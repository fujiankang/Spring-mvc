package com.xiaokang.king.RequestPrams;
import com.xiaokang.king.modelAndModelMap.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


/**
 * Created by wb263970 on 2017/7/17.
 */
@Controller
public class RequestParamController {
    @RequestMapping(value = "paramt")
    public ModelAndView loggin(@RequestParam("logginname") String logginname, @RequestParam("password") String password){

        ModelAndView mv=new ModelAndView();
        User us=new User();
        us.setLogginname(logginname);
        us.setPassword(password);
        mv.addObject("user",us);
        mv.setViewName("paramts");
        return mv;
    }
    @RequestMapping(value = "paramt2")
    public ModelAndView loggin2(@RequestParam(value = "logginname",required = true,defaultValue = "admin") String logginname, @RequestParam("password") String password){
        System.out.println("logginname:"+logginname);
        System.out.println("password:"+password);
        ModelAndView mv=new ModelAndView();
        User us=new User();
        us.setLogginname(logginname);
        us.setPassword(password);
        mv.addObject("user",us);
        mv.setViewName("paramts");
        return mv;
    }
}
