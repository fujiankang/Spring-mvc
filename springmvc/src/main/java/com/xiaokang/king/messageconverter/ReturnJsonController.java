package com.xiaokang.king.messageconverter;

import com.xiaokang.king.messageconverter.model.Book;
import org.springframework.stereotype.Controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by wb263970 on 2017/7/21.
 */
@Controller
@RequestMapping("retjson")
public class ReturnJsonController {

    @RequestMapping(value = "/testRequestBody")
    @ResponseBody
    public Object getJson() {
        List<Book> bookList = new ArrayList<Book>();
        bookList.add(new Book(1, "法律讲堂", "宋海霞"));
        bookList.add(new Book(2, "道德经", "老子"));
        return bookList;
    }
}
