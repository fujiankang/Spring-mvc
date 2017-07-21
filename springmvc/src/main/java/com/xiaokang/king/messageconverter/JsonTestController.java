package com.xiaokang.king.messageconverter;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.xiaokang.king.messageconverter.model.Book;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by wb263970 on 2017/7/20.
 */
@Controller
@RequestMapping("/json")
public class JsonTestController {
    private static final Log logger = LogFactory.getLog(JsonTestController.class);
    @RequestMapping(value = "/testRequestBody")
    public void setJson(@RequestBody Book book, HttpServletResponse response) throws IOException {
    //ObjectMapper类是Jackson库的主要类.他提供一些功能将Java对象转换成Json格式的数据
        ObjectMapper mapper=new ObjectMapper();
        //将book对象转换成json输出
        logger.info(mapper.writeValueAsString(book));
        book.setAuthor("付健康");
        book.setName("菜根谭");
        response.setContentType("text/html;charset=UTF-8");
        //将book对象转换成json写到客户端
        response.getWriter().println(mapper.writeValueAsString(book));
    }
}
