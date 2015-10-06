package tk.hadeslee.examples.functionalinterface;

import lombok.Data;

import java.math.BigDecimal;

/**
 * Created by redfo on 2015-10-06.
 */
public class FunctionalInterfaceExamples {
    public static void main(String[] args) {

    }
}
@Data
class Product {
    private Long id;
    private String name;
    private BigDecimal price;
}