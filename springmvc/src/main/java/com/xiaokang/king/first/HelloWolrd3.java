package com.xiaokang.king.first;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by wb263970 on 2017/7/13.
 */
@Controller
public class HelloWolrd3 {
    @RequestMapping("/helloWorld3")
    public String helloWorld(Model model) {
        model.addAttribute("message", "Hello World 3");
        return "HelloWorld3";
    }
}
