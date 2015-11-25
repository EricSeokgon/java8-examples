package tk.hadeslee.examples.functional_programming_in_java.Lambda_Expressions.Being_lazy;

/**
 * Project: java8-examples
 * FileName: Evaluation
 * Date: 2015-11-25
 * Time: 오전 9:55
 * Author: Hades Lee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Evaluation {
    public static boolean evaluate(final int value) {
        System.out.println("evaluting ..." + value);
        simulateTimeConsumingOp(2000);
        return value > 100;
    }
}
