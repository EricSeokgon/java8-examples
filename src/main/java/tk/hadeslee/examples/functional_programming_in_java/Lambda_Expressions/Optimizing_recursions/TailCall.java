package tk.hadeslee.examples.functional_programming_in_java.Lambda_Expressions.Optimizing_recursions;

import java.util.stream.Stream;

/**
 * Project: java8-examples
 * FileName: TailCall
 * Date: 2015-11-29
 * Time: 오전 12:21
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
@FunctionalInterface
public interface TailCall<T> {
    TailCall<T> apply();

    default boolean isComplete() {
        return false;
    }

    default T result() {
        throw new Error("not implemented");
    }

    default T invoke() {
        return Stream.iterate(this, TailCall::apply)
                .filter(TailCall::isComplete)
                .findFirst()
                .get()
                .result();
    }
}
