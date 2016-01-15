package tk.hadeslee.BJ8LF.Generics;

/**
 * Project: java8-examples
 * FileName: GenericArrayTest
 * Date: 2016-01-15
 * Time: 오전 9:11
 * Author: redfo
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class GenericArrayTest<T> {
    private T[] elements;

    public GenericArrayTest(int howMany) {
        elements = new T[howMany]; // A compile-time error
    }
// More code goes here
}
