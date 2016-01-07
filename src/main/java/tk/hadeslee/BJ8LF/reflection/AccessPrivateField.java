package tk.hadeslee.BJ8LF.reflection;

import java.lang.reflect.Field;

/**
 * Project: java8-examples
 * FileName: AccessPrivateField
 * Date: 2016-01-07
 * Time: 오전 9:11
 * Author: redfo
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class AccessPrivateField {
    public static void main(String[] args) {
        Class<Person> personClass = Person.class;
        try {
            // Create an object of the Person class
            Person p = personClass.newInstance();
            // Get the reference to name field
            Field nameField = personClass.getDeclaredField("name");
            // Make the private name field accessible
            nameField.setAccessible(true);
            // Get the current value of name field
            String nameValue = (String) nameField.get(p);
            System.out.println("Current name is " + nameValue);
            // Set a new value for name
            nameField.set(p, "Sherry");
            // Read the new value of name
            nameValue = (String) nameField.get(p);
            System.out.println("New name is " + nameValue);
        } catch (InstantiationException | IllegalAccessException |
                NoSuchFieldException | SecurityException |
                IllegalArgumentException e
                ) {
            System.out.println(e.getMessage());
        }
    }
}
