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
        final CalculatorService calculatorService = new CalculatorService(new Addition());
        final int additionResult = calculatorService.calculate(1, 1);
        System.out.println(additionResult);

        final int subtractionResult = calculatorService.calculate(1, 1);
        System.out.println(subtractionResult);

        final int multiplicactionResult = calculatorService.calculate(1, 1);
        System.out.println(multiplicactionResult);

        final int divisionResult = calculatorService.calculate(8, 4);
        System.out.println(divisionResult);
    }
}

interface Calculation {
    int calculate(final int num1, final int num2);
}

class Addition implements Calculation {

    @Override
    public int calculate(final int num1, final int num2) {
        return num1 + num2;
    }
}

class Subtraction implements Calculation {

    @Override
    public int calculate(final int num1, final int num2) {
        return num1 - num2;
    }
}

class Multiplication implements Calculation {

    @Override
    public int calculate(final int num1, final int num2) {
        return num1 * num2;
    }
}

class Division implements Calculation {

    @Override
    public int calculate(final int num1, final int num2) {
        return num1 / num2;
    }
}

class CalculatorService {
    private final Calculation calculation;

    public CalculatorService(Calculation calculation) {
        this.calculation = calculation;
    }

    public int calculate(int num1, int num2) {
        return calculation.calculate(num1, num2);
    }
}
