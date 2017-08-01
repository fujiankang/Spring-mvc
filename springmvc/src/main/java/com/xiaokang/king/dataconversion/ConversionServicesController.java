package com.xiaokang.king.dataconversion;
import com.xiaokang.king.dataconversion.models.User;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Conversion数据转换Controllers
 */
@Controller
public class ConversionServicesController {
    private static final Log logger = LogFactory.getLog(ConversionServicesController.class);
    @RequestMapping(value = "/conversion",method = RequestMethod.POST)
    public String conversionService(User user, Model model) throws  Exception{
    logger.info(user);
    System.out.println("请求到达....");
    model.addAttribute("user",user);
    return "success";
    }
}
