package tk.hadeslee.examples.stream_prelude;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

/**
 * Project: java8-examples
 * FileName: StreamExamples3
 * Date: 2015-10-09
 * Time: 오전 12:29
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class StreamExamples3 {
    public static void main(String[] args) {
        System.out.println("collect(toList()): " +
                        Stream.of(1, 3, 3, 5, 5)
                                .filter(i -> i > 2)
                                .map(i -> i * 2)
                                .map(i -> "#" + i)
                                .collect(toList())
        );

        System.out.println("collect(toSet()): " +
                        Stream.of(1, 3, 3, 5, 5)
                                .filter(i -> i > 2)
                                .map(i -> i * 2)
                                .map(i -> "#" + i)
                                .collect(toSet())
        );

        System.out.println("collect(joining()): " +
                        Stream.of(1, 3, 3, 5, 5)
                                .filter(i -> i > 2)
                                .map(i -> i * 2)
                                .map(i -> "#" + i)
                                .collect(joining())
        );

        System.out.println("collect(joining(\", \")): " +
                        Stream.of(1, 3, 3, 5, 5)
                                .filter(i -> i > 2)
                                .map(i -> i * 2)
                                .map(i -> "#" + i)
                                .collect(joining(", "))
        );

        System.out.println("collect(joining(\", \", \"[\", \"]\")): " +
                Stream.of(1, 3, 3, 5, 5)
                        .filter(i -> i > 2)
                        .map(i -> i * 2)
                        .map(i -> "#" + i)
                        .collect(joining(", ", "[", "]")) //[#6, #6, #10, #10]
        );

        System.out.println("distinct().collect(joining(\", \", \"[\", \"]\")): " +
                        Stream.of(1, 3, 3, 5, 5)
                                .filter(i -> i > 2)
                                .map(i -> i * 2)
                                .map(i -> "#" + i)
                                .distinct()
                                .collect(joining(", ", "[", "]"))
        );

        System.out.println("distinct().collect(toList()): " +
                        Stream.of(1, 3, 3, 3, 5)
                                .filter(i -> i > 2)
                                .map(i -> i * 2)
                                .map(i -> "#" + i)
                                .distinct()
                                .collect(toList())
        );

        final Integer integer3 = 3;
        System.out.println(
                Stream.of(1, 2, 3, 4, 5)
                        .filter(i -> i == integer3)
                        .findFirst()
        );

        final Integer integer127 = 127;
        System.out.println(
                Stream.of(1, 2, 3, 4, 5, 127)
                        .filter(i -> i == integer127)
                        .findFirst()
        );

        final Integer integer128 = 128;
        System.out.println(
                Stream.of(1, 2, 3, 4, 5, 128)
                        .filter(i -> i == integer128)
                        .findFirst()
        );

        System.out.println(
                Stream.of(1, 2, 3, 4, 5, 128)
                        .filter(i -> i.equals(integer128))
                        .findFirst()
        );

        System.out.println(".filter(i -> i > integer3).count()" +
                        Stream.of(1, 2, 3, 4, 5)
                                .filter(i -> i > integer3)
                                .count()
        );

        final List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("for (Integer i : numbers): ");
        for (Integer i : numbers) {
            System.out.print("i = " + i + " ");
        }
        System.out.println("\nforEach(i -> System.out.println(i)): ");
        Stream.of(1, 2, 3, 4, 5)
                .forEach(i -> System.out.print(i + " "));

    }
}
