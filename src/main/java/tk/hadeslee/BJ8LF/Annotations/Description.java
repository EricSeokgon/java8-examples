package tk.hadeslee.BJ8LF.Annotations;

/**
 * Project: java8-examples
 * FileName: Description
 * Date: 2015-12-14
 * Time: 오전 9:17
 * Author: Hades Lee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public @interface Description {
    Name name();

    Version version();

    String comments() default "";

}
