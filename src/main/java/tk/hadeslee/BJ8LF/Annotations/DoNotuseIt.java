package tk.hadeslee.BJ8LF.Annotations;

import java.lang.annotation.Annotation;

/**
 * Project: java8-examples
 * FileName: DoNotuseIt
 * Date: 2015-12-10
 * Time: 오전 9:39
 * Author: Hades Lee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class DoNotuseIt implements Version {
    @Override
    public int major() {
        return 0;
    }

    @Override
    public int minor() {
        return 0;
    }

    @Override
    public Class<? extends Annotation> annotationType() {
        return null;
    }
}
