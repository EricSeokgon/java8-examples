package tk.hadeslee.BJ8LF.innerraclasses;

/**
 * Project: java8-examples
 * FileName: HelloAnonymous
 * Date: 2015-12-19
 * Time: 오전 6:03
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class HelloAnonymous {
    public static void main(String[] args) {
        new Object() {
            //An instance initializer
            {
                System.out.println("Hello from an anonymous class");

            }
        }; //A semi-colon is necessary to end the statement
    }
}
