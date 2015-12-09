package tk.hadeslee.BJ8LF.Annotations;

/**
 * Project: java8-examples
 * FileName: WrongVersion
 * Date: 2015-12-09
 * Time: 오전 11:29
 * Author: Hades Lee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
//Won't compile
public @interface WrongVersion {
    //Cannot have parameters
    String concatenate(int major, int minor);
}
