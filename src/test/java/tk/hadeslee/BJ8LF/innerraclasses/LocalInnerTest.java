package tk.hadeslee.BJ8LF.innerraclasses;

import junit.framework.TestCase;

/**
 * Project: java8-examples
 * FileName: LocalInnerTest
 * Date: 2015-12-18
 * Time: 오전 9:57
 * Author: Hades Lee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class LocalInnerTest extends TestCase {
    public static void main(String[] args) {
        RandomInteger rTop = new RandomInteger();
        System.out.println("Random integers using Top-level class:");
        System.out.println(rTop.getValue());
        System.out.println(rTop.getValue());
        System.out.println(rTop.getValue());

        RandomLocal local = new RandomLocal();
        RandomInteger rLocal = local.getRandomInteger();
        System.out.println("\nRandom integer using local inner class:");
        System.out.println(rLocal.getValue());
        System.out.println(rLocal.getValue());
        System.out.println(rLocal.getValue());
    }

}