package tk.hadeslee.examples.stream_prelude;

import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

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


    }
}
