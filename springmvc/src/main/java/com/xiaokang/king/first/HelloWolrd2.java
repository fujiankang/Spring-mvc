package com.xiaokang.king.first;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by wb263970 on 2017/7/11.
 */
@Controller
public class HelloWolrd2  {
    private static final Log logger = LogFactory.getLog(HelloWolrd2.class);
    @RequestMapping(value = "/hello")
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        logger.info("hellowolrd 注解被调用");
        // 创建准备返回的ModelAndView对象，该对象通常包含返回视图名，模型的名称以及模型对象
        ModelAndView mv = new ModelAndView();
        // 添加模型数据，可以是任意的POJO对象
        mv.addObject("message", "Hello World 1 Code");
        // 设置视图名，视图解析器会根据该名字解析到具体的视图页面
        mv.setViewName("/WEB-INF/Jsp/index.jsp");
        // 返回ModelAndView对象
        return mv;
    }
}
