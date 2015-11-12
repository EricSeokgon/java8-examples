package tk.hadeslee.examples.functional_programming_in_java.Lambda_Expressions.Designing_with_Lambda_Expreesions;

/**
 * Project: java8-examples
 * FileName: SeaPlane
 * Date: 2015-11-12
 * Time: 오전 12:17
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class SeaPlane extends Vehicle implements FastFly, Sail {

    private int altitude;

    @Override
    public void cruise() {
        System.out.print("SeaPlane::cruise currently cruise like: ");
        if (altitude > 0) {
            FastFly.super.cruise();
        } else {
            Sail.super.cruise();
        }
    }

    public static void main(String[] args) {
        SeaPlane seaPlane = new SeaPlane();
        seaPlane.takeOff();
        seaPlane.turn();
        seaPlane.cruise();
        seaPlane.land();
    }


}
