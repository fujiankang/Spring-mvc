package com.xiaokang.king.tablabel;

import com.xiaokang.king.tablabel.JavaBean.UserModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by wb263970 on 2017/7/24.
 * 使用Map作为数据源
 */
@Controller
public class checkBoxes2Controller {
    @RequestMapping(value = "/checkboxes2Form",method= RequestMethod.GET)
    public  String Checkboxes(Model model){
        UserModel um=new UserModel();
        um.setReader(true);
        //为集合变量courses添加JAVAEE和Spring,页面checkbox复选框这两项被选中.
        List<String> list=new ArrayList<String>();
        list.add("1");
        list.add("3");
        um.setCourses(list);
        //页面展现的可供选择的复选框内容courseMap
        Map<String,String> courseMap=new HashMap<String,String>();
        courseMap.put("1","JAVAEE");
        courseMap.put("2","Mybatis");
        courseMap.put("3","Spring");
        //model中添加属性user和courseList
        model.addAttribute("user",um);
        model.addAttribute("courseMap",courseMap);
        return "checkboxes2Form";
    }
}
