package com.xiaokang.king.annotation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by wb263970 on 2017/7/18.
 */
@Controller
public class PathVariableTest {
@RequestMapping(value = "/pathvar/{userId}")
    public void pathVariableTest(@PathVariable Integer userId){
    System.out.println(userId);
}
}
