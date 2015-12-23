package tk.hadeslee.BJ8LF.innerraclasses;

/**
 * Project: java8-examples
 * FileName: Outer
 * Date: 2015-12-15
 * Time: 오전 9:25
 * Author: Hades Lee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Outer {
    private int value = 1116;

    //Inner class starts here
    public class Inner {
        public void printValue() {
            System.out.println("Inner: Value = " + value);
        } //Inner class ends here
    }

    //Instance method for the Outer class
    public void printValue() {
        System.out.println("outer : Value = " + value);
    }

    //Another instance method for the Outer class
    public void setValue(int newValue) {
        this.value = newValue;
    }
}
