package com.xiaokang.king.tablabel.JavaBean;

import java.util.List;

/**
 * Created by wb263970 on 2017/7/24.
 * 提供一个List集合属性depts用于绑定数据
 */
public class Emplyee {
    private List<Dept> depts;

    public List<Dept> getDepts() {
        return depts;
    }

    public void setDepts(List<Dept> depts) {
        this.depts = depts;
    }
}
