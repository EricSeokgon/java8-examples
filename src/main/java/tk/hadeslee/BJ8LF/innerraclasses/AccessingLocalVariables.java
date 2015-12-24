package tk.hadeslee.BJ8LF.innerraclasses;

/**
 * Project: java8-examples
 * FileName: AccessingLocalVariables
 * Date: 2015-12-25
 * Time: 오전 4:44
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class AccessingLocalVariables {
    public static void main(String[] args) {
        int x = 100;
        final int y = 200;

        class LocalInner {
            void print() {
                //Accessing the local varibale x is fine as
                //it is effectively final.
                System.out.println("x = " + x);

                //The local variable y is effectively final as
                //it has been declared final.
                System.out.println("y = " + y);
            }
        }
        LocalInner li = new LocalInner();
        li.print();
    }
}
