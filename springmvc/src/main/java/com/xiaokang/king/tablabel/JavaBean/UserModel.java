package com.xiaokang.king.tablabel.JavaBean;

import java.io.Serializable;
import java.util.List;

/**
 * Created by wb263970 on 2017/7/24.
 */
public class UserModel implements Serializable {
    private boolean reader;
    private List<String> courses;
    public UserModel() {
        super();
    }

    public boolean isReader() {
        return reader;
    }

    public void setReader(boolean reader) {
        this.reader = reader;
    }

    public List<String> getCourses() {
        return courses;
    }

    public void setCourses(List<String> courses) {
        this.courses = courses;
    }
}
