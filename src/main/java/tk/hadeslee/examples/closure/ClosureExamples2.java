package tk.hadeslee.examples.closure;

/**
 * Project: java8-examples
 * FileName: ClosureExamples2
 * Date: 2015-10-21
 * Time: 오후 1:55
 * Author: Hades Lee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class ClosureExamples2 {
    private int number = 999;

    public static void main(String[] args) {
        test();
    }

    private static void test() {
        int number = 100;

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println(number);
            }
        };
        runnable.run();

        Runnable runnable1 = () -> System.out.println(number);
        runnable1.run();
    }


}
