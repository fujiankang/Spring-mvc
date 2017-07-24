package com.xiaokang.king.tablabel;

import com.xiaokang.king.tablabel.JavaBean.UserModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wb263970 on 2017/7/24.
 */
@Controller
public class checkBoxesController {
    @RequestMapping(value = "/checkboxesForm",method= RequestMethod.GET)
    public  String Checkboxes(Model model){
        UserModel um=new UserModel();
        um.setReader(true);
        //为集合变量courses添加JAVAEE和Spring,页面checkbox复选框这两项被选中.
        List<String> list=new ArrayList<String>();
        list.add("JAVAEE");
        list.add("Spring");
        um.setCourses(list);
        //页面展现的可供选择的复选框内容courseList
        List<String> courseList=new ArrayList<String>();
        courseList.add("JAVAEE");
        courseList.add("Mybatis");
        courseList.add("Spring");
        //model中添加属性user和courseList
        model.addAttribute("user",um);
        model.addAttribute("courseList",courseList);
        return "checkboxesForm";
    }
}
