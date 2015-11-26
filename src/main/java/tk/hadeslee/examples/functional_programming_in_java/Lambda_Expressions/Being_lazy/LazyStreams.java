package tk.hadeslee.examples.functional_programming_in_java.Lambda_Expressions.Being_lazy;

/**
 * Project: java8-examples
 * FileName: LazyStreams
 * Date: 2015-11-26
 * Time: 오전 9:24
 * Author: Hades Lee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class LazyStreams {
    private static int length(final String name) {
        System.out.println("getting length for " + name);
        return name.length();
    }

    private static String toUpper(final String name) {
        System.out.println("converting to uppercase: " + name);
        return name.toLowerCase();
    }
}
