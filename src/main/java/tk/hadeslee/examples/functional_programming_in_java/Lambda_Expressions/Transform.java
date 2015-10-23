package tk.hadeslee.examples.functional_programming_in_java.Lambda_Expressions;

import static java.util.stream.Collectors.joining;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Project: java8-examples
 * FileName: Transform
 * Date: 2015-10-24
 * Time: 오전 5:46
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Transform {
    public static void main(String[] args) {
        final List<String> uppercaseNames = new ArrayList<String>();
        final List<String> friends = Arrays.asList("Brian", "nate", "neal", "Raju", "Sara", "Scott");

        System.out.println("imperative style: ");
        for (String name : friends) {
            uppercaseNames.add(name.toUpperCase());
        }
        System.out.println("=====================");

        System.out.println("functional style: ");
        friends.forEach(name -> uppercaseNames.add(name.toUpperCase()));
        System.out.println(uppercaseNames);
        System.out.println("=====================");

        System.out.println("using Lambda Expressions: ");
        friends.stream()
                .map(name -> name.toUpperCase())
                .forEach(name -> System.out.print(name + " "));

        System.out.println("\n=====================");


        System.out.println("using Lambda Expressions(ouput would be a sequence of numbers): ");
        friends.stream()
                .map(name -> name.length())
                .forEach(count -> System.out.print(count + " "));
        System.out.println("\n=====================");

        System.out.println("Using Method References: ");
        friends.stream()
                .map(String::toUpperCase)
                .forEach(name -> System.out.println(name));
        System.out.println("\n=====================");

        System.out.println("Using Method References: ");
        final String result = friends.stream()
                .map(String::toUpperCase)
                .collect(joining(" , "));
        System.out.print(result);
        System.out.println("\n=====================");


    }


}
