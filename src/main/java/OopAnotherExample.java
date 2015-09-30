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
        final CalculatorService calculatorService = new CalculatorService(new Addition(), new Subtraction());
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
    private final Calculation calculation2;

    public CalculatorService(Calculation calculation, Calculation calculation2) {
        this.calculation = calculation;
        this.calculation2 = calculation2;
    }

    public int calculate(int num1, int num2) {
        if (num1 > 10 && num2 < num1) {
            return calculation.calculate(num1, num2);
        } else {
            throw new IllegalArgumentException("Invalid input num1: " + num1 + ", num2: " + num2);
        }
    }
    public int compute(int num1, int num2) {
        if (num1 > 10 && num2 < num1) {
            return calculation2.calculate(num1, num2);
        } else {
            throw new IllegalArgumentException("Invalid input num1: " + num1 + ", num2: " + num2);
        }
    }
}
