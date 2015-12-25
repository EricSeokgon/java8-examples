package tk.hadeslee.BJ8LF.reflection;

import java.io.Serializable;

/**
 * Project: java8-examples
 * FileName: person
 * Date: 2015-12-25
 * Time: 오전 4:57
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class person implements Cloneable, Serializable {
    private int id = -1;
    private String name = "Unknown";

    public person() {
    }

    public person(int id, String name) {
        this.id = id;
        this.name = name;
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

    public Object clone(){
        try {
            return super.clone();
        }catch (CloneNotSupportedException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    public String toString() {
        return "person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
