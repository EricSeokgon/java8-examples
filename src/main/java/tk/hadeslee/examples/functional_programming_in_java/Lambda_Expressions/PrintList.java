package tk.hadeslee.examples.functional_programming_in_java.Lambda_Expressions;

import static tk.hadeslee.examples.functional_programming_in_java.Lambda_Expressions.Folks.*;

/**
 * Project: java8-examples
 * FileName: PrintList
 * Date: 2015-10-30
 * Time: 오전 9:53
 * Author: Hades Lee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class PrintList {
    public static void main(String[] args) {
        for (String name : friends) {
            System.out.println(name + ", ");
        }
    }
}
