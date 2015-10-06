package tk.hadeslee.examples.functionalinterface;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

/**
 * Created by redfo on 2015-10-06.
 */
public class FunctionalInterfaceExamples {
    public static void main(String[] args) {
        final List<Product> products = Arrays.asList(
                new Product(1L,"A", new BigDecimal("10.00")),
                new Product(2L,"B", new BigDecimal("55.50")),
                new Product(3L,"C", new BigDecimal("17.45")),
                new Product(4L,"D", new BigDecimal("23.00")),
                new Product(5L,"E", new BigDecimal("110.99"))
        );
        System.out.println(products);
    }
}
@AllArgsConstructor
@Data
class Product {
    private Long id;
    private String name;
    private BigDecimal price;
}