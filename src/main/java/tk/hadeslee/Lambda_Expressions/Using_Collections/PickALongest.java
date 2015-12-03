package tk.hadeslee.Lambda_Expressions.Using_Collections;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;


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

        final Optional<String> aLongName =
                friends.stream()
                        .reduce((name1, name2) ->
                                name1.length() >= name2.length() ? name1 : name2);
        aLongName.ifPresent(name ->
                System.out.println(String.format("A longest name: %s", name)));

        final String strveOrLonger =
                friends.stream()
                        .reduce("Steve", (name1, name2) -> name1.length() >= name2.length() ? name1 : name2);

    }
}
