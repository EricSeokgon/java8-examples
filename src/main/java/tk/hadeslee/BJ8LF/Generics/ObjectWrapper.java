package tk.hadeslee.BJ8LF.Generics;

/**
 * Project: java8-examples
 * FileName: ObjectWrapper
 * Date: 2016-01-12
 * Time: 오전 10:07
 * Author: redfo
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class ObjectWrapper {
    private Object ref;

    public ObjectWrapper(Object ref) {
        this.ref = ref;
    }

    public Object get() {
        return ref;
    }

    public void set(Object reference) {
        this.ref = ref;
    }
}
