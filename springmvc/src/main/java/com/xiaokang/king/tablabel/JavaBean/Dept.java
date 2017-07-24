package com.xiaokang.king.tablabel.JavaBean;

/**
 * Created by wb263970 on 2017/7/24.
 * 部门Model,有id和name两个属性,id作为value,name的值作为label
 */
public class Dept {
    private Integer id;
    private String name;

    public Dept() {
        super();
    }

    public Dept(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
