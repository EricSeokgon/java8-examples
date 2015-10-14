package tk.hadeslee.examples.stream_prelude;

import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

/**
 * Project: java8-examples
 * FileName: StreamExamples4
 * Date: 2015-10-14
 * Time: 오전 10:00
 * Author: Hades Lee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class StreamExamples4 {
    public static void main(String[] args) {
        Stream.of(1, 2, 3, 4, 5)
                .collect(toList());

        Stream.of(1, 2, 3, 4, 5)
                .collect(toSet());

        Stream.of(1, 2, 3, 4, 5)
                .map(i -> String.valueOf(i))
                .collect(joining());
    }
}
