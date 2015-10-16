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
        System.out.println("sum: " + sum[0]);
    }
}
