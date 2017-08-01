package com.xiaokang.king.dataconversion.models;
import java.io.Serializable;
import java.util.Date;
/**
 * Created by wb263970 on 2017/8/1.
 */
public class User implements Serializable {
    private String loginname;
//    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthday;

    public User() {
        super();
    }

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
