package tk.hadeslee.BJ8LF.innerraclasses;

/**
 * Project: java8-examples
 * FileName: ModifiedOuter2Test
 * Date: 2015-12-23
 * Time: 오전 10:58
 * Author: redfo
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class ModifiedOuter2Test {
    public static void main(String[] args) {
        ModifiedOuter2 out = new ModifiedOuter2();
        ModifiedOuter2.Inner in = out.new Inner();

        //Print the value
        out.printValue();
        in.printValue();

        //Set a new value
        out.setValue(828);

        //print the value
        out.printValue();
        in.printValue();
    }

}