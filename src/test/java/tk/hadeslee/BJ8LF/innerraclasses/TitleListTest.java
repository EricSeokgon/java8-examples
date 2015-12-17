package tk.hadeslee.BJ8LF.innerraclasses;

import junit.framework.TestCase;

import java.util.Iterator;

/**
 * Project: java8-examples
 * FileName: TitleListTest
 * Date: 2015-12-16
 * Time: 오전 12:47
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class TitleListTest extends TestCase {

    public static void main(String[] args) {
        TitleList tl = new TitleList();

        //Add two titles
        tl.addTitle("Beginning Java 8");
        tl.addTitle("Scripting in Java");

        //Get the iterator
        Iterator iterator = tl.titleIterator();

        //Ptint all titles using the iterator
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}