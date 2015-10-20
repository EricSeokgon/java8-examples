package tk.hadeslee.examples.closure;

/**
 * Project: java8-examples
 * FileName: ClosureExamples
 * Date: 2015-10-20
 * Time: 오전 10:57
 * Author: Hades Lee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class ClosureExamples {
    public static void main(String[] args) {
        final int number = 100;

        final Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println(number);
            }
        };
        runnable.run();
    }
}
