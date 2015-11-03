package tk.hadeslee.examples.functional_programming_in_java.Lambda_Expressions.String_Compararors_Filters;

/**
 * Project: java8-examples
 * FileName: Person
 * Date: 2015-11-01
 * Time: 오전 12:23
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Person {

    final private String name;
    final private int age;

    public Person(final String theName, final int theAge) {
        name = theName;
        age = theAge;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int ageDifference(final Person other) {
        return age - other.age;
    }

    public String toString() {
        return String.format("%s , %d", name, age);
    }
}
