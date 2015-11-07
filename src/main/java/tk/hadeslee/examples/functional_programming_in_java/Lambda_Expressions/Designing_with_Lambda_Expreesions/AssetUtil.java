package tk.hadeslee.examples.functional_programming_in_java.Lambda_Expressions.Designing_with_Lambda_Expreesions;

import java.util.List;

/**
 * Project: java8-examples
 * FileName: AssetUtil
 * Date: 2015-11-08
 * Time: 오전 2:41
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class AssetUtil {
    public static int totalAssetValues(final List<Asset> assets) {
        return assets.stream()
                .mapToInt(Asset::getValue)
                .sum();
    }
}
