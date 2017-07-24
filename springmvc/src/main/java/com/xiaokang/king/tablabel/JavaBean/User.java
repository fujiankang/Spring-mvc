package com.xiaokang.king.tablabel.JavaBean;

import java.io.Serializable;

/**
 * Created by wb263970 on 2017/7/21.
 */
public class User implements Serializable {
    private Integer ids;
    private String username;
    private String sex;
    private Integer age;
    private String password;
    private String remark;

    public User() {
        super();
    }

    public User(Integer ids,String username, String sex, Integer age,String password,String remark) {
        this.username = username;
        this.sex = sex;
        this.age = age;
        this.password = password;
        this.ids = ids;
        this.remark=remark;
    }

    public Integer getIds() {
        return ids;
    }

    public void setIds(Integer ids) {
        this.ids = ids;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
