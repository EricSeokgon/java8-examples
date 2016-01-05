package tk.hadeslee.BJ8LF.reflection;

/**
 * Project: java8-examples
 * FileName: PublicPerson
 * Date: 2016-01-06
 * Time: 오전 8:42
 * Author: redfo
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class PublicPerson {
    private int id = -1;
    public String name = "Unknown";

    public PublicPerson() {
    }

    @Override
    public String toString() {
        return "PublicPerson{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
