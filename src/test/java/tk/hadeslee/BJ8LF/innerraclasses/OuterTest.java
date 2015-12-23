package tk.hadeslee.BJ8LF.innerraclasses;

/**
 * Project: java8-examples
 * FileName: OuterTest
 * Date: 2015-12-23
 * Time: 오전 9:26
 * Author: redfo
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class OuterTest {
    public static void main(String[] args) {
        Outer out = new Outer();
        Outer.Inner in = out.new Inner();

        //Print the value
        out.printValue();
        in.printValue();

        //Set a new value
        out.setValue(828);

        //Print the value
        out.printValue();
        in.printValue();
    }
}