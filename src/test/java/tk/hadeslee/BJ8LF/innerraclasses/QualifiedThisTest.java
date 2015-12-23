package tk.hadeslee.BJ8LF.innerraclasses;

/**
 * Project: java8-examples
 * FileName: QualifiedThisTest
 * Date: 2015-12-23
 * Time: 오전 10:06
 * Author: redfo
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class QualifiedThisTest {
    public static void main(String[] args) {
        QualifiedThis qt = new QualifiedThis();
        System.out.println("printValue():");
        qt.printValue();

        System.out.println("\nprintHiddenValue():");
        qt.printHiddenValue();
    }

}