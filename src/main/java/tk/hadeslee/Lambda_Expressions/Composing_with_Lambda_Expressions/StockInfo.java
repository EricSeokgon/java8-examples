package tk.hadeslee.Lambda_Expressions.Composing_with_Lambda_Expressions;

import java.math.BigDecimal;

/**
 * Project: java8-examples
 * FileName: StockInfo
 * Date: 2015-12-04
 * Time: 오전 10:51
 * Author: Hades Lee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class StockInfo {
    public final String ticker;
    public final BigDecimal price;

    public StockInfo(final String ticker, final BigDecimal price) {
        this.ticker = ticker;
        this.price = price;
    }

    @Override
    public String toString() {
        return "StockInfo{" +
                "ticker='" + ticker + '\'' +
                ", price=" + price +
                '}';
    }
}
