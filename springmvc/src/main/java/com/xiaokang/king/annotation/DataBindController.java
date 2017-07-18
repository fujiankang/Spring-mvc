package com.xiaokang.king.annotation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by wb263970 on 2017/7/18.
 */
@Controller//用于指定一个控制器,可以同时处理多个请求动作
public class DataBindController {
    //静态日志LogFactory
    private static final Log logger = LogFactory.getLog(DataBindController.class);

    //测试@PathVariable注解
    @RequestMapping(value = "/pathVariable/{userId}")
    public void pathVariableTest(@PathVariable Integer userId) {
        logger.info("通过@PathVariable获得的数据:" + userId);
    }

    //测试@RequestHeader注解
    @RequestMapping(value = "/requestHeaderTest")
    public void requestHeaderTest(@RequestHeader("User-Agent") String userAgent, @RequestHeader(value = "Accept") String[] accepts) {
        logger.info("通过@RequestHeader获得的数据" + userAgent);
        for (String accept : accepts) {
            logger.info(accept);
        }
    }
    //测试@CookieValue
    public class CookieValueTest {
        @RequestMapping(value = "/cookieValueTest")
        public void cookieValueTest(@CookieValue(value = "JSESSIONID", defaultValue = "") String sessionId) {
            logger.info("通过@CookieValue获得的数据" + sessionId);
        }
    }
}
