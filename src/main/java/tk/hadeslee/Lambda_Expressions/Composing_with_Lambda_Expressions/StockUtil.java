package tk.hadeslee.Lambda_Expressions.Composing_with_Lambda_Expressions;

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
}
