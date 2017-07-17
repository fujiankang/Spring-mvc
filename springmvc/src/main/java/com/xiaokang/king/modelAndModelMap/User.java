package com.xiaokang.king.modelAndModelMap;

/**
 * Created by wb263970 on 2017/7/17.
 */
public class User {
    private String logginname;
    private String password;

    public void setLogginname(String logginname) {
        this.logginname = logginname;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLogginname() {
        return logginname;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "User{" +
                "logginname='" + logginname + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
