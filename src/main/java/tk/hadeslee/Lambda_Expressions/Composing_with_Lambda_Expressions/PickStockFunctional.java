package tk.hadeslee.Lambda_Expressions.Composing_with_Lambda_Expressions;

import java.util.stream.Stream;

/**
 * Project: java8-examples
 * FileName: PickStockFunctional
 * Date: 2015-12-07
 * Time: 오전 10:11
 * Author: Hades Lee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class PickStockFunctional {
    public static void findHighPeiced(final Stream<String> symbols) {
        final StockInfo highPeiced =
                symbols
                        .map(StockUtil::getPrice)
                        .filter(StockUtil.isPriceLessThan(500))
                        .reduce(StockUtil::pickHigh)
                        .get();

        System.out.println("High priced under $500 is " + highPeiced);
    }

    public static void main(String[] args) {
        findHighPeiced(Tickers.symbols.stream());

    }

}
