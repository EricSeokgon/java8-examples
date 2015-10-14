package tk.hadeslee.examples.stream_prelude;

import java.math.BigInteger;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Project: java8-examples
 * FileName: StreamExamples1
 * Date: 2015-10-07
 * Time: 오후 4:14
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class StreamExamples1 {
    public static void main(String[] args) {
        IntStream.rangeClosed(1, 10).forEach(i -> System.out.print(i + " "));
        IntStream.iterate(1, i -> i + 1)
                .forEach(i -> System.out.println(i + " "));
        Stream.iterate(BigInteger.ONE, i -> i.add(BigInteger.ONE))
                .forEach(i -> System.out.print(i + " "));
    }
}
