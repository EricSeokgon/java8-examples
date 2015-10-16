package tk.hadeslee.examples.functional_programming_in_java;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

/**
 * Project: java8-examples
 * FileName: DiscountImperative
 * Date: 2015-10-17
 * Time: 오전 3:57
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class DiscountImperative {
    public static void main(String[] args) {
        final List<BigDecimal> prices = Arrays.asList(
                new BigDecimal("10"), new BigDecimal("30"), new BigDecimal("17"),
                new BigDecimal("20"), new BigDecimal("15"), new BigDecimal("18"),
                new BigDecimal("45"), new BigDecimal("12"));

        BigDecimal totalOfDiscountPrices = BigDecimal.ZERO;

        for (BigDecimal price : prices) {
            if (price.compareTo(BigDecimal.valueOf(20)) > 0)
                totalOfDiscountPrices =
                        totalOfDiscountPrices.add(price.multiply(BigDecimal.valueOf(0.9)));
        }
        System.out.println("=========================================");
        System.out.println("Total of discount prices: " + totalOfDiscountPrices);

        final BigDecimal totalOfDiscountPrices2 =
                prices.stream()
                        .filter(price -> price.compareTo(BigDecimal.valueOf(20)) > 0)
                        .map(price -> price.multiply(BigDecimal.valueOf(0.9)))
                        .reduce(BigDecimal.ZERO, BigDecimal::add);

        System.out.println("Total of discount prices(stream().filter)): " + totalOfDiscountPrices2);
    }


}
