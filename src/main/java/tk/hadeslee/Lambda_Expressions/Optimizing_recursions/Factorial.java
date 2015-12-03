package tk.hadeslee.Lambda_Expressions.Optimizing_recursions;

import static tk.hadeslee.Lambda_Expressions.Optimizing_recursions.TailCalls.call;
import static tk.hadeslee.Lambda_Expressions.Optimizing_recursions.TailCalls.done;

/**
 * Project: java8-examples
 * FileName: Factorial
 * Date: 2015-11-28
 * Time: 오전 8:07
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Factorial {
    public static int factorialRec(final int number) {
        if (number == 1) {
            return number;
        } else {
            return number * factorialRec(number - 1);
        }
    }

    public static void main(String[] args) {
        try {
            System.out.println(factorialRec(5));
            //System.out.println(factorialRec(20000));
            System.out.println(factorialTailRec(1, 2).invoke());
            System.out.println(factorialTailRec(1, 5).invoke());
            System.out.println(factorialTailRec(1, 20000).invoke());
            System.out.println(factorial(5));
            System.out.println(factorial(20000));
        } catch (StackOverflowError ex) {
            System.out.println(ex);
        }
    }

    public static TailCall<Integer> factorialTailRec(final int factorial, final int number) {
        if (number == 1) {
            return done(factorial);
        } else {
            return call(() -> factorialTailRec(factorial * number, number - 1));
        }
    }

    public static int factorial(final int number) {
        return factorialTailRec(1, number).invoke();
    }

}
