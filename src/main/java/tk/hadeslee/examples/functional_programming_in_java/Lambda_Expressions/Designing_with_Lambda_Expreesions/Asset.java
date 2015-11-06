package tk.hadeslee.examples.functional_programming_in_java.Lambda_Expressions.Designing_with_Lambda_Expreesions;

/**
 * Project: java8-examples
 * FileName: Asset
 * Date: 2015-11-07
 * Time: 오전 4:47
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Asset {
    public enum AssetType{BOND, STOCK,};

    private final AssetType type;
    private final int value;

    public Asset(AssetType type, int value) {
        this.type = type;
        this.value = value;
    }

    public AssetType getType() {
        return type;
    }

    public int getValue() {
        return value;
    }
}
