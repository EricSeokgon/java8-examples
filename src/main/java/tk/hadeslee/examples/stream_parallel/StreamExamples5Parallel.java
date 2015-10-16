package tk.hadeslee.examples.stream_parallel;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;
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
        System.out.println("                   sum(side-effect): " + sum[0]);

        final int[] sum2 = {0};
        IntStream.range(0, 100)
                .parallel()
                .forEach(i -> sum2[0] += i);

        System.out.println("          parallel sum(side-effect): " + sum2[0]);

        System.out.println("         stream sum(no side-effect): " +
                IntStream.range(0, 100)
                        .sum());
        System.out.println("parallel stream sum(no side-effect): " +
                IntStream.range(0, 100)
                        .parallel()
                        .sum());

        /*System.out.println("\n=================================");
        System.out.println("Stream");
        final long start = System.currentTimeMillis();
        Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8)
                .stream()
                .map(i -> {
                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    return i;
                })
                .forEach(i -> System.out.println(i));
        System.out.println(System.currentTimeMillis() - start);*/

        System.out.println("\n=================================");
        System.out.println("Parallel Stream (8 elements)");
        final long start2 = System.currentTimeMillis();
        Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8)
                .parallelStream()
                .map(i -> {
                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    return i;
                })
                .forEach(i -> System.out.println(i));
        System.out.println(System.currentTimeMillis() - start2);

        System.out.println("\n=================================");
        System.out.println("Parallel Stream (9 elements)");
        final long start3 = System.currentTimeMillis();
        Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9)
                .parallelStream()
                .map(i -> {
                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    return i;
                })
                .forEach(i -> System.out.println(i));
        System.out.println(System.currentTimeMillis() - start3);

        System.out.println("\n=================================");
        System.out.println("Parallel Stream (8 elements) with parallelism: 7");
        System.setProperty("java.util.concurrent.ForkJoinPool.common.parallelism", "7");
        final long start4 = System.currentTimeMillis();
        Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8)
                .parallelStream()
                .map(i -> {
                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    return i;
                })
                .forEach(i -> System.out.println(i));
        System.out.println(System.currentTimeMillis() - start4);

        System.out.println("\n=================================");
        System.out.println("Parallel Stream (8 elements) with parallelism: 3");
        System.setProperty("java.util.concurrent.ForkJoinPool.common.parallelism", "3");
        final long start5 = System.currentTimeMillis();
        Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8)
                .parallelStream()
                .map(i -> {
                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    return i;
                })
                .forEach(i -> System.out.println(i));
        System.out.println(System.currentTimeMillis() - start5);
    }
}
