package tk.hadeslee.examples.functional_programming_in_java;

import java.util.Arrays;
import java.util.List;

/**
 * Project: java8-examples
 * FileName: Iteration
 * Date: 2015-10-18
 * Time: 오전 12:24
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Iteration {
    public static void main(String[] args) {
        final List<String> friends = Arrays.asList("Brian", "nate", "neal", "Raju", "Sara", "Scott");
        System.out.println("========================");
        System.out.println("old for loop: \n");
        for (int i = 0; i < friends.size(); i++) {
            System.out.println(friends.get(i));

        }
        System.out.println("========================");
        System.out.println("forech loop: \n");
        for (String name : friends) {
            System.out.println(name);
        }

    }
}

