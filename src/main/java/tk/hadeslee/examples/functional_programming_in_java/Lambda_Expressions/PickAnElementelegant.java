package tk.hadeslee.examples.functional_programming_in_java.Lambda_Expressions;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Project: java8-examples
 * FileName: PickAnElementelegant
 * Date: 2015-10-27
 * Time: 오전 11:41
 * Author: Hades Lee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class PickAnElementelegant {
    public static void pickName(
            final List<String> names, final String startingLetter) {

        final Optional<String> foundName =
                names.stream()
                        .filter(name -> name.startsWith(startingLetter))
                        .findFirst();

        System.out.println(String.format("A name starting with %s: %s", startingLetter, foundName.orElse("No name found")));
    }

    public static void main(String[] args) {
        final List<String> friends = Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");
        pickName(friends, "N");
        pickName(friends, "Z");
    }
}
