package tk.hadeslee.examples.functional_programming_in_java.Lambda_Expressions.Being_lazy;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Project: java8-examples
 * FileName: Primes
 * Date: 2015-11-27
 * Time: 오전 9:32
 * Author: Hades Lee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Primes {
    public static boolean isPrime(final int number) {
        return number > 1 &&
                IntStream.rangeClosed(2, (int) Math.sqrt(number))
                        .noneMatch(divisor -> number % divisor == 0);
    }

    private static int primeAgter(final int number) {
        if (isPrime(number + 1)) {
            return number + 1;
        } else {
            return primeAgter(number + 1);
        }

    }

    public static List<Integer> ptimes(final int fromNumber, final int count) {
        return Stream.iterate(primeAgter(fromNumber - 1), Primes::primeAgter)
                .limit(count).collect(Collectors.<Integer>toList());
    }
}
