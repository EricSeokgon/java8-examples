package tk.hadeslee.BJ8LF.Annotations;

/**
 * Project: java8-examples
 * FileName: DefaultException
 * Date: 2015-12-14
 * Time: 오전 9:04
 * Author: Hades Lee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class DefaultException extends java.lang.Throwable {
    public DefaultException() {

    }

    public DefaultException(String msg) {
        super(msg);
    }
}
