package tk.hadeslee.BJ8LF.innerraclasses;

import java.util.Random;

/**
 * Project: java8-examples
 * FileName: RandomInteger
 * Date: 2015-12-18
 * Time: 오전 9:29
 * Author: Hades Lee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class RandomInteger {

    protected Random rand = new Random();

    public int getValue() {
        return rand.nextInt();

    }
}
