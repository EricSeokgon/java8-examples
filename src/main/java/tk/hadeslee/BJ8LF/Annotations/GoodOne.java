package tk.hadeslee.BJ8LF.Annotations;

import org.junit.Test;

/**
 * Project: java8-examples
 * FileName: GoodOne
 * Date: 2015-12-12
 * Time: 오전 7:36
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public @interface GoodOne {
    Class element1(); //Any Class type
    Class<Test> element2(); //Only Test class type
    Class<? extends Test> element3(); //Test or its subclass type
}
