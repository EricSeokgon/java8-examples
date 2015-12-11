package tk.hadeslee.BJ8LF.Annotations;

/**
 * Project: java8-examples
 * FileName: DefaultTest
 * Date: 2015-12-12
 * Time: 오전 7:41
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public @interface DefaultTest {
    double d() default 12.89;

    int num() default 12;

    int[] x() default {1, 2};

    String s() default "Hello";

    String[] s2() default {"abc", "xyz"};

    Class c() default Exception.class;

    Class[] c2() default {Exception.class, java.io.IOException.class};
}
