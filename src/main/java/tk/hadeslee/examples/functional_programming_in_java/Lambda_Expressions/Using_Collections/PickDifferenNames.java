package tk.hadeslee.examples.functional_programming_in_java.Lambda_Expressions.Using_Collections;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Project: java8-examples
 * FileName: PickDifferenNames
 * Date: 2015-10-26
 * Time: 오전 9:43
 * Author: Hades Lee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class PickDifferenNames {
//    public static Predicate<String> checkIfStartsWith(final String letter) {
//        return name -> name.startsWith(letter);
//    }

    public static void main(String[] args) {
        final List<String> friends = Arrays.asList("Brian", "nate", "neal", "Raju", "Sara", "Scott");
//        final Predicate<String> startsWithN = name -> name.startsWith("N");
//        final Predicate<String> startsWithB = name -> name.startsWith("B");

        final Function<String, Predicate<String>> startsWithLetter =
                letter -> name -> name.startsWith(letter);

        final long countFriendsStartN =
                friends.stream().filter(startsWithLetter.apply("N")).count();

        final long countFriendsStartB =
                friends.stream().filter(startsWithLetter.apply("B")).count();

    }
}
