package com.xiaokang.king.dataconversion.databinder;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.support.WebBindingInitializer;
import org.springframework.web.context.request.WebRequest;
import java.util.Date;

/**
 * Created by wb263970 on 2017/8/1.
 * 定义全局的编辑器转换数据
 */
public class DateBindingInitializer implements WebBindingInitializer {
    @Override
    public void initBinder(WebDataBinder webDataBinder, WebRequest webRequest) {
        webDataBinder.registerCustomEditor(Date.class,new InItBinder());
    }
}
