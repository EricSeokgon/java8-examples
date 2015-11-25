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

    private static void simulateTimeConsumingOp(int i) {

    }

    public static void eagerEvaluator(
            final boolean input1, final boolean input2) {
        System.out.println("eagerEvaluator called...");
        System.out.println("accept?: " + (input1 && input2));
    }

    public static void lazyEvaluator(
            final Supplier<Boolean> input1, final Supplier<Boolean> input2) {

        System.out.println("lazyEvaluator called...");
//        System.out.println("accept?: " + (input1.get() && input2.get()));
    }

    public static void main(String[] args) {
        eagerEvaluator(evaluate(1), evaluate(2));
        //      lazyEvaluator(() -> evaluate(2), () -> evaluate(1));
    }
}
