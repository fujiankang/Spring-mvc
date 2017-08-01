package com.xiaokang.king.dataconversion;
import com.xiaokang.king.dataconversion.models.User;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Conversion数据转换Controllers ,全局模式
 */
@Controller
public class ConversionInitBinder2Controller {
    private static final Log logger = LogFactory.getLog(ConversionInitBinder2Controller.class);
    @RequestMapping(value = "/initbinder2",method = RequestMethod.POST)
    public String conversionService(User user, Model model) throws  Exception{
    logger.info(user);
    System.out.println("全局转换方法测试");
    model.addAttribute("user",user);
    return "success";
    }
}
