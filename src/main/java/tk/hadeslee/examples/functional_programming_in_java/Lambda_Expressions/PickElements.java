package tk.hadeslee.examples.functional_programming_in_java.Lambda_Expressions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Project: java8-examples
 * FileName: PickElements
 * Date: 2015-10-25
 * Time: 오전 12:40
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class PickElements {
    public static void main(String[] args) {
        final List<String> friends = Arrays.asList("Brian", "nate", "neal", "Raju", "Sara", "Scott");
        ;

        final List<String> startsWithN = new ArrayList<String>();
        for (String name : friends) {
            startsWithN.add(name);
        }

        final List<String> startsWithN2 =
                friends.stream()
                        .filter(name -> name.startsWith("N"))
                        .collect(Collectors.toList());
    }
}
