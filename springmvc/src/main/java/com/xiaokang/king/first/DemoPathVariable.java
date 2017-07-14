package com.xiaokang.king.first;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.Arrays;
import java.util.Map;

/**
 * Created by wb263970 on 2017/7/13.
 */
@SessionAttributes(value={"names"},types={Integer.class})
@Controller
public class DemoPathVariable {

    @RequestMapping(value = "/pets/{petId}", produces = "application/json;charset=utf-8")
    public String findPet(@PathVariable String petId, Model model) {
        // implementation omitted
        return petId;
    }

    @RequestMapping(value = "/head")
    public String RequstHead(@RequestHeader("Accept-Language") String Language, Model model) {
        String language = Language;
        System.out.println(language);
        model.addAttribute("message", "Hello World 3");
        return "HelloWorld3";
    }

    @RequestMapping(value = "/cookie")
    public String RequstCookie(@CookieValue("JSESSIONID") String Cookie, Model model) {
        String cookie = Cookie;
        System.out.println(cookie);
        model.addAttribute("message", "Hello World 3");
        return "HelloWorld3";
    }

    @RequestMapping(value = "/param", method = RequestMethod.GET)
    public String RequstParam(@RequestParam("method") String method, Model model) {
        String Method = method;
        System.out.println(Method);
        model.addAttribute("message", "Hello World 3");
        return "HelloWorld3";
    }

    @RequestMapping(value = "/something", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
    public
    @ResponseBody
    Bean handle(@RequestBody Bean bean) {
        System.out.println(bean);
        return bean;
    }

    @RequestMapping(value = "/sesstionattr")
    public String test(Map<String, Object> map) {
        map.put("names", Arrays.asList("caoyc", "zhh", "cjx"));
        map.put("age", 18);
        return "sessionattr";
    }
}

class Bean {
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Bean{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}







