package com.xiaokang.king.dataconversion;
import com.xiaokang.king.dataconversion.models.User;
import com.xiaokang.king.dataconversion.databinder.InItBinder;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;
/**
 * Conversion数据转换Controllers
 */
@Controller
public class ConversionInitBinderController {
    private static final Log logger = LogFactory.getLog(ConversionInitBinderController.class);
    @RequestMapping(value = "/initbinder",method = RequestMethod.POST)
    public String conversionService(User user, Model model) throws  Exception{
    logger.info(user);
    System.out.println("请求到达....InItBinder方法测试");
    model.addAttribute("user",user);
    return "success";
    }
    /**
     *  WebDataBinder 对象用于处理请求消息和处理方法的绑定工作 binder.registerCustomEditor方法
     */
    @InitBinder
    public void initbinder(WebDataBinder binder){
        //注册自定义编辑器.
        binder.registerCustomEditor(Date.class,new InItBinder());
    }
}
