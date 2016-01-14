package tk.hadeslee.BJ8LF.Generics;

/**
 * Project: java8-examples
 * FileName: WrapperUtil
 * Date: 2016-01-14
 * Time: 오전 9:38
 * Author: redfo
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class WrapperUtil {
    public static void printDetails(Wrapper<?> wrapper) {
// Can assign get() return value to Object
        Object value = wrapper.get();
        String className = null;
        if (value != null) {
            className = value.getClass().getName();
        }
        System.out.println("Class: " + className);
        System.out.println("Value: " + value);
    }
}
