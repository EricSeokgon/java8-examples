package tk.hadeslee.Lambda_Expressions.Optimizing_recursions;

import static tk.hadeslee.Lambda_Expressions.Optimizing_recursions.Memoizer.callMemoized;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * Project: java8-examples
 * FileName: java
 * Date: 2015-12-02
 * Time: 오전 10:57
 * Author: Hades Lee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class RodCutterBasic {
    final List<Integer> prices;

    public RodCutterBasic(List<Integer> pricesForLength) {
        this.prices = pricesForLength;
    }

    public int maxProfit(final int length) {
        int profit = (length <= prices.size()) ? prices.get(length - 1) : 0;
        for (int i = 1; i < length; i++) {
            int priceWhenCut = maxProfit(i) + maxProfit(length - i);
            if (profit < priceWhenCut) profit = priceWhenCut;
        }
        return profit;
    }

    public int maxProfit2(final int rodLenth) {
        return callMemoized(
                (final Function<Integer, Integer> func, final Integer length) -> {
                    int profit = (length <= prices.size()) ? prices.get(length - 1) : 0;
                    for (int i = 1; i < length; i++) {
                        int priceWenCut = func.apply(i) + func.apply(length - 1);
                        if (profit < priceWenCut) profit = priceWenCut;
                    }
                    return profit;
                }, rodLenth);
    }

    public static void main(String[] args) {
        final List<Integer> priceValues = Arrays.asList(2, 1, 1, 2, 2, 2, 1, 8, 9, 15);
        final RodCutterBasic rodCutter = new RodCutterBasic(priceValues);

        System.out.println(rodCutter.maxProfit(5));
        System.out.println(rodCutter.maxProfit(22));

        System.out.println(rodCutter.maxProfit2(5));
        System.out.println(rodCutter.maxProfit2(22));
    }
}
