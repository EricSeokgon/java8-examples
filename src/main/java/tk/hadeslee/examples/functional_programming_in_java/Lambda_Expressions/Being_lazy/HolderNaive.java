package tk.hadeslee.examples.functional_programming_in_java.Lambda_Expressions.Being_lazy;

/**
 * Project: java8-examples
 * FileName: HolderNaive
 * Date: 2015-11-24
 * Time: 오전 10:15
 * Author: Hades Lee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class HolderNaive {
    private Heavy heavy;

    public HolderNaive() {
        System.out.println("Holder created");
    }

    public Heavy getHeavy() {
        if (heavy == null) {
            heavy = new Heavy();
        }
        return heavy;
    }
}
