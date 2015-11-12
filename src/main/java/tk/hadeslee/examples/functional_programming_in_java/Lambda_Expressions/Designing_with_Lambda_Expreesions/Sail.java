package tk.hadeslee.examples.functional_programming_in_java.Lambda_Expressions.Designing_with_Lambda_Expreesions;

/**
 * Project: java8-examples
 * FileName: Sail
 * Date: 2015-11-12
 * Time: 오전 12:13
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public interface Sail {
    default void cruise(){System.out.println("Sail::cruise");}
    default void turn(){System.out.println("Sail::turn");}
}

