package tk.hadeslee.junit;

import org.junit.Test;

/**
 * Project: java8-examples
 * FileName: CalculatorTest
 * Date: 2015-12-02
 * Time: 오후 1:56
 * Author: Hades Lee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        double result = calculator.add(11, 50);
        if (result != 60) {
            System.out.println("Bad result: " + result);
        }
    }

    @Test
    public void testAdd() throws Exception {

    }
}