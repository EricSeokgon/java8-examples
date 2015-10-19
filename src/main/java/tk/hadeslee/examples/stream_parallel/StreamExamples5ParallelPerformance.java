package tk.hadeslee.examples.stream_parallel;

import java.util.concurrent.TimeUnit;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/**
 * Project: java8-examples
 * FileName: StreamExamples5ParallelPerformance
 * Date: 2015-10-19
 * Time: 오전 11:28
 * Author: Hades Lee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class StreamExamples5ParallelPerformance {
    private static void slowDown() {
        try {
            TimeUnit.MILLISECONDS.sleep(10L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public static long iterativeSum(long n) {
        long result = 0;
        for (long i = 0; i <= n; i++) {
            result += i;
            slowDown();
        }
        return result;
    }

    public static long sequentialSum(long n) {
        return Stream.iterate(1L, i -> i + 1).limit(n).peek(i -> slowDown()).reduce(Long::sum).get();
    }

    public static long parallelSum(long n) {
        return Stream.iterate(1L, i -> i + 1).limit(n).parallel().peek(i -> slowDown()).reduce(Long::sum).get();
    }

    public static long rangeSum(long n) {
        return LongStream.rangeClosed(1, n).peek(i -> slowDown()).reduce(Long::sum).getAsLong();
    }

    public static long parallelRangeSum(long n) {
        return LongStream.rangeClosed(1, n).parallel().peek(i -> slowDown()).reduce(Long::sum).getAsLong();
    }

    public static void main(String[] args) {
        final long n = 1000;

        /*final long start = System.currentTimeMillis();
        1 + 2 + 3 + ... + 98 + 99 + 100
        System.out.println((1 + n) * (n / 2));
        System.out.println(System.currentTimeMillis() - start);
        */

        final long start1 = System.currentTimeMillis();
        System.out.println("iterativeSum(n): " + iterativeSum(n));
        System.out.println("                 " + (System.currentTimeMillis() - start1) + " ms\n");
        final long start2 = System.currentTimeMillis();
        System.out.println("sequentialSum(n): " + sequentialSum(n));
        System.out.println("                 " + (System.currentTimeMillis() - start2) + " ms\n");
        final long start3 = System.currentTimeMillis();
        System.out.println("parallelSum(n): " + parallelSum(n));
        System.out.println("                 " + (System.currentTimeMillis() - start3) + " ms\n");
        final long start4 = System.currentTimeMillis();
        System.out.println("rangeSum(n): " + rangeSum(n));
        System.out.println("                 " + (System.currentTimeMillis() - start4) + " ms\n");
        final long start5 = System.currentTimeMillis();
        System.out.println("parallelRangeSum(n): " + parallelRangeSum(n));
        System.out.println("                 " + (System.currentTimeMillis() - start5) + " ms\n");
    }

}

