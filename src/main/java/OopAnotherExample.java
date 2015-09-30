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
        final int additionResult = calculatorService.calculate('+', 1, 1);
        System.out.println(additionResult);

        final int subtractionResult = calculatorService.calculate('-', 1, 1);
        System.out.println(subtractionResult);

        final int multiplicactionResult = calculatorService.calculate('*', 1, 1);
        System.out.println(multiplicactionResult);

        final int divisionResult = calculatorService.calculate('/', 8, 4);
        System.out.println(divisionResult);
    }
}

class CalculatorService {
    public int calculate(char calculation, int num1, int num2) {
        if (calculation == '+') {
            return num1 + num2;
        } else if (calculation == '-') {
            return num1 - num2;
        } else if (calculation == '*') {
            return num1 * num2;
        } else if (calculation == '/') {
            return num1 / num2;
        } else {
            throw new IllegalArgumentException("Unknown calculation: " + calculation);
        }
    }
}
