package com.xiaokang.king.tablabel;

import com.xiaokang.king.tablabel.JavaBean.Sex;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by wb263970 on 2017/7/24.
 */
@Controller
public class radioController {
    @RequestMapping(value = "/radiobuttonForm",method = RequestMethod.GET)
    public String radiobuttonController(Model model){
        Sex sex=new Sex();
        sex.setSex("男");
        model.addAttribute("sex",sex);
        return "radiobuttonForm";
    }
}
