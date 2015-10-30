package tk.hadeslee.examples.functional_programming_in_java.Lambda_Expressions;

/**
 * Project: java8-examples
 * FileName: iterateString
 * Date: 2015-10-31
 * Time: 오전 12:33
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class iterateString {
    public static void main(String[] args) {
        final String str = "w00t";

        str.chars().forEach(ch-> System.out.println(ch));
    }
}
