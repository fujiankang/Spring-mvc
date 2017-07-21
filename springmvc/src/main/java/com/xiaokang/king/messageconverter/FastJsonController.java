package com.xiaokang.king.messageconverter;

import com.alibaba.fastjson.JSONObject;
import com.xiaokang.king.messageconverter.model.Book;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/**
 *
 */
@Controller
@RequestMapping("/fastjson")
public class FastJsonController {
    private static final Log logger = LogFactory.getLog(FastJsonController.class);

    @RequestMapping(value = "/testRequestBody")
    public void setJson(@RequestBody Book book, HttpServletResponse response) throws IOException {
        //JsonObject-lib包是一个beans,collections,maps,java arrays和xml和Json互相转换的包
        //JsonObject将book对象转换成json输出.
        logger.info(JSONObject.toJSONString(book));
        book.setAuthor("李白");
        book.setName("唐诗三百首");
        book.setId(1);
        response.setContentType("text/html;charset=UTF-8");
        //将book对象转换成json写到客户端
        response.getWriter().println(JSONObject.toJSON(book));
    }

}
