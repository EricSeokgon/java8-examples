package tk.hadeslee.Lambda_Expressions.Designing_with_Lambda_Expreesions;

import java.util.Arrays;
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

    public static int totalBondValues(final List<Asset> assets) {
        return assets.stream()
                .mapToInt(asset ->
                        asset.getType() == Asset.AssetType.BOND ? asset.getValue() : 0)
                .sum();
    }

    public static int totalStockValues(final List<Asset> assets) {
        return assets.stream()
                .mapToInt(asset ->
                        asset.getType() == Asset.AssetType.STOCK ? asset.getValue() : 0)
                .sum();
    }

    final static List<Asset> assets = Arrays.asList(
            new Asset(Asset.AssetType.BOND, 1000),
            new Asset(Asset.AssetType.BOND, 2000),
            new Asset(Asset.AssetType.STOCK, 3000),
            new Asset(Asset.AssetType.STOCK, 4000)
    );

    public static void main(String[] args) {
        System.out.println("Total of all assets: " + totalAssetValues(assets));
        System.out.println("Total of bonds: " + totalBondValues(assets));
        System.out.println("Total of sotcks: " + totalStockValues(assets));
    }
}
