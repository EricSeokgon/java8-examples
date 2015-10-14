package tk.hadeslee.examples.stream_prelude;

import static java.util.stream.Collectors.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;


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
        final List<Product> products = Arrays.asList(
                new Product(1L, "A", new BigDecimal("100.50")),
                new Product(2L, "B", new BigDecimal("23.00")),
                new Product(3L, "C", new BigDecimal("31.45")),
                new Product(4L, "D", new BigDecimal("80.20")),
                new Product(5L, "E", new BigDecimal("7.50"))
        );

        System.out.println("product.getPrice >= 30: \n" +
                        products.stream()
                                .filter(product -> product.getPrice().compareTo(new BigDecimal("30")) >= 0)
                                .collect(toList())

        );
        System.out.println("\n======================================\n");
        System.out.println("product.getPrice >= 30(with joining(\"\\n\")): \n" +
                        products.stream()
                                .filter(product -> product.getPrice().compareTo(new BigDecimal("30")) >= 0)
                                .map(product -> product.toString())
                                .collect(joining("\n"))
        );

        System.out.println("\n======================================\n");
        System.out.println("IntStram.sum: " +
                        IntStream.of(1, 2, 3, 4, 5)
                                .sum()
        );

        System.out.println("\n======================================\n");
        System.out.println("Total Price: " +
                        products.stream()
                                .map(product -> product.getPrice())
                                .reduce(BigDecimal.ZERO, (price1, price2) -> price1.add(price2))

        );
        // .reduce(BigDecimal.ZERO, (product1, product2) -> product1.getPrice().add(product2.getPrice()))

        System.out.println("\n======================================\n");
        System.out.println("Total Price of Products.price >= 30: " +
                        products.stream()
                                .filter(product -> product.getPrice().compareTo(new BigDecimal("30")) >= 0)
                                .map(product1 -> product1.getPrice())
                                .reduce(BigDecimal.ZERO, (price1, price2) -> price1.add(price2))

        );

        System.out.println("\n======================================\n");
        System.out.println("# of Products.price >= 30: " +
                        products.stream()
                                .filter(product -> product.getPrice().compareTo(new BigDecimal("30")) >= 0)
                                .count()

        );
    }
}

@AllArgsConstructor
@Data
class Product {
    private Long id;
    private String name;
    private BigDecimal price;
}

@AllArgsConstructor
@Data
class OrderedItem {
    private Long id;
    private Product product;
    private int quantity;
}

@AllArgsConstructor
@Data
class Order {
    private Long id;
    private List<OrderedItem> items;
}
