package tk.hadeslee.examples.stream_prelude;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * Project: java8-examples
 * FileName: StreamPrelude
 * Date: 2015-10-07
 * Time: 오후 2:41
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class StreamPrelude {
    public static void main(String[] args) {
        final int abs1 = Math.abs(-1);
        final int abs2 = Math.abs(1);

        System.out.println("abs1: " + abs1);
        System.out.println("abs2: " + abs2);
        System.out.println("abs1 == abs2 is " + (abs1 == abs2));

        final int minInt = Math.abs(Integer.MIN_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println("minInt: " + minInt);

        final List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("mapOld(numbers, i -> i * 2)");
        System.out.println(
                mapOld(numbers, i -> i * 2)
        );
        System.out.println("mapOld(numbers, null)");
        System.out.println(
                mapOld(numbers, null)
        );

        System.out.println(" ");
        System.out.println("map(numbers, i -> i * 2)\n" +
                        map(numbers, i -> i * 2)
        );
        System.out.println("map(numbers, i -> i)\n" +
                        map(numbers, i -> i)
        );
        System.out.println("map(numbers, Function.identity())\n" +
                        map(numbers, Function.identity())
        );
    }

    private static <T, R> List<R> map(final List<T> list, final Function<T, R> mapper) {
        final Function<T, R> function;
        if (mapper != null) {
            function = mapper;
        } else {
            function = t -> (R) t;
        }

        final List<R> result = new ArrayList<>();
        for (final T t : list) {
            result.add(function.apply(t));
        }
        return result;
    }

    private static <T, R> List<R> mapOld(final List<T> list, final Function<T, R> mapper) {
        final List<R> result;
        if (mapper != null) {
            result = new ArrayList<>();
        } else {
            result = new ArrayList<>((List<R>) list);
        }
        if (result.isEmpty()) {
            for (final T t : list) {
                result.add(mapper.apply(t));
            }
        }
        return result;
    }
}
