package tk.hadeslee.BJ8LF.innerraclasses;

/**
 * Project: java8-examples
 * FileName: QualifiedThis
 * Date: 2015-12-23
 * Time: 오전 9:48
 * Author: redfo
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class QualifiedThis {
    //Instance variable - value

    private int value = 828;

    public void printValue() {
        //Print value using simple name of instance variavle
        System.out.println("value = " + value);

        //Print value using keyword this
        System.out.println("this.value = " + this.value);

        //Print value using keyword this qualified with the class name
        System.out.println("QualifiedThis.this.value= " + QualifiedThis.this.value);
    }

    public void printHiddenValue() {
        //Declare a local variable value, which hides the value instance variable
        int value = 131;

        //Print value using simple name, which refers to the local variable - 131
        System.out.println("value = " + value);

        //Print value using keyword this, which refers to the instance
        ///variable value with value 828
        System.out.println("this.value= " + this.value);

        //Print value using keyword this qualidied with the class name,
        //which refers to instance variable value as 828
        System.out.println("QualifedThis.this.value= " + QualifiedThis.this.value);

    }


}
