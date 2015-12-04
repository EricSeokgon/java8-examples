package tk.hadeslee.Lambda_Expressions.Composing_with_Lambda_Expressions;

import static java.util.stream.Collectors.joining;

import java.math.BigDecimal;

/**
 * Project: java8-examples
 * FileName: stocks100
 * Date: 2015-12-04
 * Time: 오전 10:43
 * Author: Hades Lee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class stocks100 {
    public static void main(String[] args) {
        final BigDecimal HUNDRED = new BigDecimal("100");
        System.out.println("Stocks priced over $100 are " +
                Tickers.symbols
                        .stream()
                        .filter(symbol -> YahooFinance.getPrice(symbol).compareTo(HUNDRED) > 0)
                        .sorted()
                        .collect(joining(", ")));
    }
}
