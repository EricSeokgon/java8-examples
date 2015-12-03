package tk.hadeslee.Lambda_Expressions.Designing_with_Lambda_Expreesions;

import static tk.hadeslee.Lambda_Expressions.Designing_with_Lambda_Expreesions.AssetUtil.assets;

import java.util.List;
import java.util.function.Predicate;

/**
 * Project: java8-examples
 * FileName: AssetUtilRefactored
 * Date: 2015-11-09
 * Time: 오전 9:31
 * Author: Hades Lee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class AssetUtilRefactored {
    public static int totalAssetValues(final List<Asset> assets,
                                       final Predicate<Asset> assetSelector) {
        return assets.stream().filter(assetSelector).mapToInt(Asset::getValue).sum();
    }

    public static void main(String[] args) {

        System.out.println("Total of all assets: " + totalAssetValues(assets, asset -> true));
        System.out.println("Total of bonds: " + totalAssetValues(assets, asset -> asset.getType() == Asset.AssetType.BOND));
        System.out.println("Total of stocks: " + totalAssetValues(assets, asset -> asset.getType() == Asset.AssetType.STOCK));

    }
}
