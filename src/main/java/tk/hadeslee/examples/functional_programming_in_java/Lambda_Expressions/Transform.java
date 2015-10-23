package tk.hadeslee.examples.functional_programming_in_java.Lambda_Expressions;

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

        for (String name : friends) {
            uppercaseNames.add(name.toUpperCase());
        }

    }


}
