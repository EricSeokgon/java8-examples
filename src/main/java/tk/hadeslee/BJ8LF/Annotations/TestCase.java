package tk.hadeslee.BJ8LF.Annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Project: java8-examples
 * FileName: TestCase
 * Date: 2015-12-14
 * Time: 오전 9:05
 * Author: Hades Lee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface TestCase {
    Class<? extends Throwable> willThrow() default DefaultException.class;
}
