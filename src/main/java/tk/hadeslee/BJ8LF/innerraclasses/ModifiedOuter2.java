package tk.hadeslee.BJ8LF.innerraclasses;

/**
 * Project: java8-examples
 * FileName: ModifiedOuter2
 * Date: 2015-12-23
 * Time: 오전 10:52
 * Author: redfo
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class ModifiedOuter2 {
    //Instance variable for ModifiedOuter2 class
    private int value = 1116;

    //Inner class start here
    public class Inner {
        //Instance variable for Inner class
        private int value = 1720;

        public void printValue() {
            System.out.println("\nInner - printValue()...");
            System.out.println("Inner: Value = " + value);
            System.out.println("Outer: Value = " + ModifiedOuter2.this.value);
        }
    } //Inner class ends here

    //Instance method for ModifiedOuter2 class
    public void printValue() {
        System.out.println("\nOuter = printValue()...");
        System.out.println("Outer: Value = " + value);
    }

    //Anther instance method for the ModifiedOuter2 class
    public void setValue(int newValue) {
        System.out.println("\nSetting Outer's value to " + newValue);
        this.value = newValue;
    }

}
