package javabean;

import java.io.Serializable;

public class Student  implements Serializable {
    private int id;
    public String name;

    public Student(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
