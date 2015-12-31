package tk.hadeslee.BJ8LF.reflection;

import tk.hadeslee.Lambda_Expressions.String_Compararors_Filters.Person;

/**
 * Project: java8-examples
 * FileName: NewInstanceTest
 * Date: 2016-01-01
 * Time: 오전 12:40
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class NewInstanceTest {
    public static void main(String[] args) throws InstantiationException {
        Class<Person> personClass = Person.class;
        try {
// Create new instance of Person class
            Person p = personClass.newInstance();
            System.out.println(p);
        } catch (InstantiationException | IllegalAccessException e) {
            System.out.println(e.getMessage());
        }
    }
}
