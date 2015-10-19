package tk.hadeslee.examples.stream_prelude;

import java.util.stream.Stream;

/**
 * Project: java8-examples
 * FileName: StreamExamples2
 * Date: 2015-10-16
 * Time: 오후 3:33
 * Author: Hades Lee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class StreamExamples2 {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, 2, 3);

        stream.filter(value -> value > 0)
                .forEach(value -> System.out.println(value));

    }
}
