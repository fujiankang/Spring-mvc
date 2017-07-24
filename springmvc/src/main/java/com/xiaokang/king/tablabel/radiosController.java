package com.xiaokang.king.tablabel;

import com.xiaokang.king.tablabel.JavaBean.Sex;
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
public class radiosController {
    @RequestMapping(value = "/radiosbuttonForm",method = RequestMethod.GET)
    public String radiobuttonController(Model model){
        //设置sex变量的值为男,页面的radio单选框的value=男会被选中
        Sex sex=new Sex();
        sex.setSex("男");
        //页面可供选择的单选框内容sexList
        List<String> sexlist=new ArrayList<String>();
        sexlist.add("男");
        sexlist.add("女");
        sexlist.add("保密");
        model.addAttribute("sex",sex);
        model.addAttribute("sexList",sexlist);
        return "radiobuttonsForm";
    }
}
