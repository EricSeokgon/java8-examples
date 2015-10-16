package tk.hadeslee.examples.stream_parallel;

import java.util.stream.IntStream;

/**
 * Project: java8-examples
 * FileName: StreamExamples5Parallel
 * Date: 2015-10-16
 * Time: 오전 9:50
 * Author: Hades Lee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class StreamExamples5Parallel {
    public static void main(String[] args) {

        final int[] sum = {0};
        IntStream.range(0, 100)
                .forEach(i -> sum[0] += i);
        System.out.println("         sum(with side-effect): " + sum[0]);

        final int[] sum2 = {0};
        IntStream.range(0, 100)
                .parallel()
                .forEach(i -> sum2[0] += i);
        System.out.println("parallel sum(with side-effect): " + sum2[0]);

        System.out.println("    stream sum(no side-effect): " +
                IntStream.range(0, 100)
                        .sum());
        System.out.println("    stream sum(no side-effect): " +
                        IntStream.range(0, 100)
                                .parallel()
                                .sum()
        );
    }
}
