package tk.hadeslee.BJ8LF.innerraclasses;

/**
 * Project: java8-examples
 * FileName: ComputerAccessoryTest
 * Date: 2015-12-22
 * Time: 오전 9:10
 * Author: redfo
 * Note:
 * To change this template use File | Settings | File Templates.
 */

public class ComputerAccessoryTest {

    public static void main(String[] args) {
        //Create two monitors
        ComputerAccessory.Monitor m17 = new ComputerAccessory.Monitor(17);
        ComputerAccessory.Monitor m19 = new ComputerAccessory.Monitor(19);

        //Create two Keyboard
        ComputerAccessory.keyboard k122 = new ComputerAccessory.keyboard(122);
        ComputerAccessory.keyboard k142 = new ComputerAccessory.keyboard(142);

        System.out.println(m17);
        System.out.println(m19);

        System.out.println(k122);
        System.out.println(k142);
    }

}