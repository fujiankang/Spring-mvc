package com.xiaokang.king.dataconversion.databinder;
import org.springframework.core.convert.converter.Converter;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * Created by wb263970 on 2017/8/1.
 */
public class StringToDateConverter implements Converter<String, Date> {
    //定义日期类型格式模版
    private String dataPattern;

    //Converter<S,T>接口的类型转换方法
    public void setDataPattern(String dataPattern) {
        this.dataPattern = dataPattern;
    }
    @Override
    public Date convert(String date) {
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat(this.dataPattern);
            //将日期转换为Date类型返回
            return dateFormat.parse(date);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("日期类型转换失败");
            return null;
        }
    }
}
