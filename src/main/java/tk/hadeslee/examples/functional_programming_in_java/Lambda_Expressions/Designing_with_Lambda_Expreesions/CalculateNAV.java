package tk.hadeslee.examples.functional_programming_in_java.Lambda_Expressions.Designing_with_Lambda_Expreesions;

import java.math.BigDecimal;
import java.util.function.Function;

/**
 * Project: java8-examples
 * FileName: CalculateNAV
 * Date: 2015-11-10
 * Time: 오전 10:38
 * Author: Hades Lee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class CalculateNAV {
    public BigDecimal computeStockWorth(final String ticker, final int shares) {
        return priceFinder.apply(ticker).multiply(BigDecimal.valueOf(shares));
    }

    private Function<String, BigDecimal> priceFinder;

    public CalculateNAV(final Function<String, BigDecimal> aPriceFinder){
        priceFinder = aPriceFinder;
    }
}
