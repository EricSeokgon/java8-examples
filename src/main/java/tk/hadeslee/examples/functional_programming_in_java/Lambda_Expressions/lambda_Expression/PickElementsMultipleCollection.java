package tk.hadeslee.examples.functional_programming_in_java.Lambda_Expressions.lambda_Expression;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Project: java8-examples
 * FileName: PickElementsMultipleCollection
 * Date: 2015-10-26
 * Time: 오전 9:23
 * Author: Hades Lee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class PickElementsMultipleCollection {

    public static void main(String[] args) {
        final List<String> friends = Arrays.asList("Brian", "nate", "neal", "Raju", "Sara", "Scott");
        final List<String> comrades = Arrays.asList("Kate", "Ken", "Nick", "Paula", "Zach");
        final List<String> editors = Arrays.asList("Brian", "Jackie", "Jogh", "Mike");
        final Predicate<String> startWithN = name -> name.startsWith("N");

        final long countFriendsStartN =
                friends.stream().filter(startWithN).count();

        final long countComradesStartN =
                comrades.stream().filter(startWithN).count();

        final long countEditorsStartN =
                editors.stream().filter(startWithN).count();

    }
}
