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
public class checkBoxController {
    @RequestMapping(value = "/checkboxForm",method= RequestMethod.GET)
    public  String registerForm(Model model){
        UserModel um=new UserModel();
        um.setReader(true);
        //为集合变量courses添加JAVAEE和Spring,页面checkbox复选框这两项被选中.
        List<String> list=new ArrayList<String>();
        list.add("JAVAEE");
        list.add("Spring");
        um.setCourses(list);
        //model中添加属性user,值是user对象.
        model.addAttribute("user",um);
        return "checkboxForm";
    }
}
