package com.xiaokang.king.annotation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by wb263970 on 2017/7/18.
 */
@Controller
public class RequestHeaderTest {
    @RequestMapping(value = "/requestHeaderTest")
    public void requestHeaderTest(@RequestHeader("User-Agent") String userAgent, @RequestHeader(value = "Accept") String[] accepts) {
        System.out.println("userAgent:"+userAgent);
        for (String str:accepts){
            System.out.println(str);
        }
    }
}
