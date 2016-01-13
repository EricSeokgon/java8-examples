package tk.hadeslee.BJ8LF.Generics;

/**
 * Project: java8-examples
 * FileName: Wrapper
 * Date: 2016-01-13
 * Time: 오전 9:44
 * Author: redfo
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Wrapper<T> {
    private T ref;

    public Wrapper(T ref) {
        this.ref = ref;
    }

    public T get() {
        return ref;
    }

    public void set(T a) {
        this.ref = ref;
    }
}
