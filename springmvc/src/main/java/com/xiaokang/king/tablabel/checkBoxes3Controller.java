package com.xiaokang.king.tablabel;

import com.xiaokang.king.tablabel.JavaBean.Dept;
import com.xiaokang.king.tablabel.JavaBean.Emplyee;
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
public class checkBoxes3Controller {
    @RequestMapping(value = "/checkboxes3Form",method= RequestMethod.GET)
    public  String Checkboxes(Model model){
        Emplyee emplyee=new Emplyee();
        Dept dept=new Dept(1,"研发部");
        //为集合变量depts添加Dept对象,该对象id=1,name="研发部",页面checkbox复选框这一项会被选中.
        List<Dept> list=new ArrayList<Dept>();
        list.add(dept);
        emplyee.setDepts(list);
        //页面展现的可供选择的复选框内容deptList
        List<Dept> deptList=new ArrayList<Dept>();
        deptList.add(dept);
        deptList.add(new Dept(2,"销售部"));
        deptList.add(new Dept(3,"财务部"));
        //model中添加属性employee和deptList
        model.addAttribute("employee",emplyee);
        model.addAttribute("deptList",deptList);
        return "checkboxes3Form";
    }
}
