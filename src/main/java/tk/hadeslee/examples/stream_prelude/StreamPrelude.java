package tk.hadeslee.examples.stream_prelude;

/**
 * Project: java8-examples
 * FileName: StreamPrelude
 * Date: 2015-10-07
 * Time: 오후 2:41
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class StreamPrelude {
    public static void main(String[] args) {
        final int abs1 = Math.abs(-1);
        final int abs2 = Math.abs(1);

        System.out.println("abs1: " + abs1);
        System.out.println("abs2: " + abs2);
        System.out.println("abs1 == abs2 is " + (abs1 == abs2));

        final int minInt = Math.abs(Integer.MIN_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println("minInt: " + minInt);
    }
}
