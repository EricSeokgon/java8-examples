/**
 * Project: java8-examples
 * FileName: OopAnotherExample
 * Date: 2015-09-30
 * Time: 오후 1:13
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class OopAnotherExample {
    public static void main(String[] args) {
        final CalculatorService calculatorService = new CalculatorService();
        final int result = calculatorService.calculate(1, 1);
        System.out.println(result);
    }
}

class CalculatorService {
    public int calculate(int num1, int num2) {
        return num1 + num2;
    }
}
