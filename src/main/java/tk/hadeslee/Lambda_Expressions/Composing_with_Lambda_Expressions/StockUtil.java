package tk.hadeslee.Lambda_Expressions.Composing_with_Lambda_Expressions;

import java.math.BigDecimal;
import java.util.function.Predicate;

/**
 * Project: java8-examples
 * FileName: StockUtil
 * Date: 2015-12-04
 * Time: 오전 10:54
 * Author: Hades Lee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class StockUtil {
    public static StockInfo getPrice(final String ticker) {
        return new StockInfo(ticker, YahooFinance.getPrice(ticker));
    }

    public static Predicate<StockInfo> isPriceLessThan(final int price) {
        return stockInfo -> stockInfo.price.compareTo(BigDecimal.valueOf(price)) < 0;
    }

    public static StockInfo pickHigh(
            final StockInfo stockInfo1, final StockInfo stockInfo2) {
        return stockInfo1.price.compareTo(stockInfo2.price) > 0 ? stockInfo1 : stockInfo2;
    }

}
