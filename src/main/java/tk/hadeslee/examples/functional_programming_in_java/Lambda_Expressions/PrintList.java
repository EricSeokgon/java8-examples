package tk.hadeslee.examples.functional_programming_in_java.Lambda_Expressions;

import static java.util.stream.Collectors.joining;
import static tk.hadeslee.examples.functional_programming_in_java.Lambda_Expressions.Folks.*;

/**
 * Project: java8-examples
 * FileName: PrintList
 * Date: 2015-10-30
 * Time: 오전 9:53
 * Author: Hades Lee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class PrintList {
    public static void main(String[] args) {
        System.out.println("list and print each element");
        for (String name : friends) {
            System.out.println(name + ", ");
        }
        System.out.println("===========================");
        System.out.println("Let's see if the output of this version was decent.");
        for (int i = 0; i < friends.size() - 1; i++) {
            System.out.println(friends.get(i) + ", ");
        }
        if (friends.size() > 0) {
            System.out.println(friends.get(friends.size() - 1));
        }
        System.out.println("===========================");
        System.out.println("Java8 and the String class has an added convenience method join() to turn that smelly code into a simple on-liner.");
        System.out.println(String.join(", ", friends));

        System.out.println("===========================");
        System.out.println("lamba expressions and the newly added classes and methods make programming.");
        System.out.println(
                friends.stream().map(String::toUpperCase).collect(joining(", ")));

    }
}
