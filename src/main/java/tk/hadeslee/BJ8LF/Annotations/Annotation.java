package tk.hadeslee.BJ8LF.Annotations;

import java.util.Objects;

/**
 * Project: java8-examples
 * FileName: Annotation
 * Date: 2015-12-09
 * Time: 오전 11:30
 * Author: Hades Lee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public interface Annotation {
    boolean equals(Objects objects);

    int hasfCode();

    String toString();

    Class<? extends Annotation> anntationType();

}
