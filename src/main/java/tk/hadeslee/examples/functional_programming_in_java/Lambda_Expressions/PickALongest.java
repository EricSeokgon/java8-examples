package tk.hadeslee.examples.functional_programming_in_java.Lambda_Expressions;

import java.util.Arrays;
import java.util.List;

/**
 * Project: java8-examples
 * FileName: PickALongest
 * Date: 2015-10-28
 * Time: 오전 9:37
 * Author: Hades Lee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class PickALongest {
    public static void main(String[] args) {
        final List<String> friends = Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");

        System.out.println("Total number od characters in all names: " +
                friends.stream()
                        .mapToInt(name -> name.length())
                        .sum());
    }
}
