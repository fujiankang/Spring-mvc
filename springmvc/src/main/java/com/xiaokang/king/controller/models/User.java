package com.xiaokang.king.controller.models;

/**
 * Created by wb263970 on 2017/7/19.
 */
public class User {
    private String loginname;
    private String password;
    private String role;

    public User(String loginname, String password, String role) {
        this.loginname = loginname;
        this.password = password;
        this.role = role;
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
