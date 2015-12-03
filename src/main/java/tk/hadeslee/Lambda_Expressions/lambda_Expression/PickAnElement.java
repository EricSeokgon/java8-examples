package tk.hadeslee.Lambda_Expressions.lambda_Expression;

import java.util.List;

/**
 * Project: java8-examples
 * FileName: PickAnElement
 * Date: 2015-10-27
 * Time: 오전 10:52
 * Author: Hades Lee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class PickAnElement {
    final static void pickName(
            final List<String> names, final String startingLetter) {
        String foundName = null;
        for (String name : names) {
            if (name.startsWith(startingLetter)) {
                foundName = name;
                break;
            }
        }
        System.out.print(String.format("A name starting with %s: ", startingLetter));
        if (foundName != null) {
            System.out.println(foundName);
        } else {
            System.out.println("No name found");
        }
    }
}
