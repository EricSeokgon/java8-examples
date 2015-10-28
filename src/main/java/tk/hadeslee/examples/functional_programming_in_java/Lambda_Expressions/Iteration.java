package tk.hadeslee.examples.functional_programming_in_java.Lambda_Expressions;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

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
        final List<String> friends = Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");
        System.out.println("========================");
        System.out.println("old for loop(iterate and print each of the elements): \n");
        for (int i = 0; i < friends.size(); i++) {
            System.out.println(friends.get(i));

        }

        System.out.println("========================");
        System.out.println("enhanced  for loop: \n");
        for (String name : friends) {
            System.out.println(name);
        }

        System.out.println("========================");
        System.out.println("forEach() method: \n");
        friends.forEach(new Consumer<String>() {
            @Override
            public void accept(final String name) {
                System.out.println(name);
            }
        });

        System.out.println("========================");
        System.out.println("forEach() method(lambda expression): \n");
        friends.forEach((final String name) -> System.out.println(name));

        System.out.println("========================");
        System.out.println("forEach() method(lambda expression without the type information): \n");
        friends.forEach((name) -> System.out.println(name));

        System.out.println("========================");
        System.out.println("non-final forEach() method(single-parameter lambda expression as special): \n");
        friends.forEach(name -> System.out.println(name));

        System.out.println("========================");
        System.out.println("forEach() method(lambda expression concisely): \n");
        friends.forEach(System.out::println);

    }
}

