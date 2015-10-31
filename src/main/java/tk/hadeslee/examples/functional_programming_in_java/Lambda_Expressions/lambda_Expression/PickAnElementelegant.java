package tk.hadeslee.examples.functional_programming_in_java.Lambda_Expressions.lambda_Expression;

import static tk.hadeslee.examples.functional_programming_in_java.Lambda_Expressions.lambda_Expression.Folks.friends;

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

        foundName.ifPresent(name -> System.out.println("Hello " + name));
    }

    public static void main(String[] args) {

        pickName(friends, "N");
        pickName(friends, "Z");

    }
}
