/**
 * Project: java8-examples
 * FileName: Loop
 * Date: 2015-12-01
 * Time: 오전 9:36
 * Author: Hades Lee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Loop {
    public static void main(String[] args) {
        for (byte i = -128; i <= 127; i++) {

            String s1 = String.format("%8s", Integer.toBinaryString(i & 0xFF).replace(' ', '0'));
            System.out.println(i + ":" + s1);
        }
    }
}
