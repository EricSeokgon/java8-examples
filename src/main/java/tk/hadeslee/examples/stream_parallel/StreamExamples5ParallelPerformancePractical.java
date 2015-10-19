package tk.hadeslee.examples.stream_parallel;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * Project: java8-examples
 * FileName: StreamExamples5ParallelPerformancePractical
 * Date: 2015-10-19
 * Time: 오후 1:23
 * Author: Hades Lee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class StreamExamples5ParallelPerformancePractical {
    private static final String[] priceStrings = {"1.0", "100.99", "35.75", "21.30", "88.00"};
    private static final BigDecimal[] targetPrices = {new BigDecimal("30"), new BigDecimal("20"), new BigDecimal("31")};
    private static final Random random = new Random(123);
    private static final Random targetPriceRandom = new Random(111);

    private static final List<Product> products;

    static {
        final int length = 8_000_000;
        final Product[] list = new Product[length];
        for (int i = 1; i <= length; i++) {
            list[i - 1] = new Product((long) i, "Product" + i, new BigDecimal(priceStrings[random.nextInt(5)]));
        }
        products = Arrays.asList(list);
    }

    private static BigDecimal imperativeSum(final List<Product> products, final Predicate<Product> predicate) {
        BigDecimal sum = BigDecimal.ZERO;
        for (final Product product : products) {
            if (predicate.test(product)) {
                sum = sum.add(product.getPrice());
            }
        }
        return sum;
    }

    private static BigDecimal streamSum(final Stream<Product> stream, final Predicate<Product> predicate) {
        return stream.filter(predicate).map(Product::getPrice).reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    private static BigDecimal parallelStreamSum(final Stream<Product> stream, final Predicate<Product> predicate) {
        return stream.filter(predicate).map(Product::getPrice).reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    private static void impreativeTest(BigDecimal targetPrice) {
        System.out.println("===========================");
        System.out.println("\nImperative Sum\n---------------------------");
        final long start = System.currentTimeMillis();
        System.out.println("Sum: " +
                        imperativeSum(products, product -> product.getPrice().compareTo(targetPrice) >= 0)
        );
        System.out.println("It took " + (System.currentTimeMillis() - start) + " ms.");
        System.out.println("===========================");
    }

    private static void streamTest(BigDecimal targetPrice) {
        System.out.println("===========================");
        System.out.println("\nStream Sum\n---------------------------");
        final long start = System.currentTimeMillis();
        System.out.println("Sum: " +
                        streamSum(products.stream(), product -> product.getPrice().compareTo(targetPrice) >= 0)
        );
        System.out.println("It took " + (System.currentTimeMillis() - start) + " ms.");
        System.out.println("===========================");
    }

    private static void parallelStreamTest(BigDecimal targetPrice) {
        System.out.println("===========================");
        System.out.println("\nParallel Stream Sum\n---------------------------");
        final long start = System.currentTimeMillis();
        System.out.println("Sum: " +
                        parallelStreamSum(products.parallelStream(), product -> product.getPrice().compareTo(targetPrice) >= 0)
        );
        System.out.println("It took " + (System.currentTimeMillis() - start) + " ms.");
        System.out.println("===========================");
    }

    public static void main(String[] args) {

        final BigDecimal targetPrice = new BigDecimal("40");

        streamTest(targetPrice);
        parallelStreamTest(targetPrice);
        impreativeTest(targetPrice);

        System.out.println("\nIgnore Tests Above\n=====================");
        System.out.println("Start!");
        for (int i = 0; i < 5; i++) {
            BigDecimal price = targetPrices[targetPriceRandom.nextInt(3)];

            parallelStreamTest(price);
            streamTest(price);
            impreativeTest(price);

        }

    }
}

@AllArgsConstructor
@Data
class Product {
    private Long id;
    private String name;
    private BigDecimal price;
}
