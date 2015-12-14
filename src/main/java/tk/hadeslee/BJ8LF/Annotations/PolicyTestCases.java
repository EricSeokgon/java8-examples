package tk.hadeslee.BJ8LF.Annotations;

import java.io.IOException;

/**
 * Project: java8-examples
 * FileName: PolicyTestCases
 * Date: 2015-12-14
 * Time: 오전 9:07
 * Author: Hades Lee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class PolicyTestCases {
    //Must throw IOExceptionn
    @TestCase(willThrow = IOException.class)
    public static void testCase1() {
        // Code goes here
    }

    // We are not expecting any exception

    @TestCase()
    public static void testCase2() {
        //Code goes here
    }
}
