package tk.hadeslee.BJ8LF.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Project: java8-examples
 * FileName: InvokeMethodTest
 * Date: 2016-01-04
 * Time: 오전 9:03
 * Author: redfo
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class InvokeMethodTest {
    public static void main(String[] args) {
        Class<Person> personClass = Person.class;
        try {
// Create an object of Person class
            Person p = personClass.newInstance();
            System.out.println(p);
// Get the reference of teh setName() method
            Method setName = personClass.getMethod("setName", String.class);
// Invoke the setName() method on p passing
// a new value for name as "Ann"
            setName.invoke(p, "Ann");
            System.out.println(p);
        } catch (InstantiationException | IllegalAccessException |
                NoSuchMethodException | SecurityException |
                IllegalArgumentException | InvocationTargetException e) {
            System.out.println(e.getMessage());
        }
    }
}

