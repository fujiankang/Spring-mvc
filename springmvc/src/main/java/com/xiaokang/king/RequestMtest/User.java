package com.xiaokang.king.RequestMtest;

import java.io.Serializable;

/**
 * Created by wb263970 on 2017/7/17.
 */
public class User implements Serializable {
    //私有字段
    private String loginname;
    private String password;
    private String username;

    //公共构造器
    public User() {
        super();
    }

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
