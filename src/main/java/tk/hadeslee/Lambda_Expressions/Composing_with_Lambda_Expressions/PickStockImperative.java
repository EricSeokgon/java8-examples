package tk.hadeslee.Lambda_Expressions.Composing_with_Lambda_Expressions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Project: java8-examples
 * FileName: PickStockImperative
 * Date: 2015-12-05
 * Time: 오전 12:52
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class PickStockImperative {

    public static void main(String[] args) {
        final List<StockInfo> stocks = new ArrayList<>();
        for (String symbol : Tickers.symbols) {
            stocks.add(StockUtil.getPrice(symbol));
        }

        final List<StockInfo> stockPricedUnder500 = new ArrayList<>();
        final Predicate<StockInfo> isPriceLessThan500 = StockUtil.isPriceLessThan(500);
        for (StockInfo stock : stocks) {
            if (isPriceLessThan500.test(stock))
                stockPricedUnder500.add(stock);
        }

    }


}
