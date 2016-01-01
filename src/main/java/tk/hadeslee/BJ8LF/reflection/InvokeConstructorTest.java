package tk.hadeslee.BJ8LF.reflection;

import tk.hadeslee.Lambda_Expressions.String_Compararors_Filters.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Project: java8-examples
 * FileName: InvokeConstructorTest
 * Date: 2016-01-01
 * Time: 오전 12:41
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class InvokeConstructorTest {
    public static void main(String[] args) {
        Class<Person> personClass = Person.class;

        try {
// Get the constructor "Person(int, String)"
            Constructor<Person> cons =
                    personClass.getConstructor(int.class, String.class);
// Invoke the constructor with values for id and name
            Person chris = cons.newInstance(1994, "Chris");
            System.out.println(chris);
        } catch (NoSuchMethodException | SecurityException |
                InstantiationException | IllegalAccessException |
                IllegalArgumentException | InvocationTargetException e) {
            System.out.println(e.getMessage());
        }
    }
}
