package tk.hadeslee.Lambda_Expressions.Composing_with_Lambda_Expressions;

import java.math.BigDecimal;
import java.util.function.Predicate;

/**
 * Project: java8-examples
 * FileName: PickStockImperativeClubbed
 * Date: 2015-12-08
 * Time: 오전 12:44
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class PickStockImperativeClubbed {
    public static void main(String[] args) {
        StockInfo highPriceed = new StockInfo("", BigDecimal.ZERO);
        final Predicate<StockInfo> isPriceLessThan500 = StockUtil.isPriceLessThan(500);

        for (String symbol : Tickers.symbols) {
            StockInfo stockInfo = StockUtil.getPrice(symbol);

            if (isPriceLessThan500.test(stockInfo))
                highPriceed = StockUtil.pickHigh(highPriceed, stockInfo);
        }
        System.out.println("High priced under $500 is " + highPriceed);
    }


}
