package com.xiaokang.king.tablabel;
import com.xiaokang.king.tablabel.JavaBean.Sex;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by wb263970 on 2017/7/24.
 */
@Controller
public class radiosMapController {
    @RequestMapping(value = "/radiosMapbuttonForm",method = RequestMethod.GET)
    public String radiobuttonController(Model model){
        //设置sex变量的值为男,页面的radio单选框的value=男会被选中
        Sex sex=new Sex();
        sex.setSex("1");
        //页面可供选择的单选框内容sexList
        Map<String,String> sexMap=new HashMap<String, String>();
        sexMap.put("1","男");
        sexMap.put("2","女");
        sexMap.put("3","保密");
        model.addAttribute("sex",sex);
        model.addAttribute("sexMap",sexMap);
        return "radiosMapbuttonForm";
    }
}
