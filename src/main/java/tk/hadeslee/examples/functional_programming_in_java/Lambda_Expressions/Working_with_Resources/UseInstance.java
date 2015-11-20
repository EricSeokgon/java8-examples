package tk.hadeslee.examples.functional_programming_in_java.Lambda_Expressions.Working_with_Resources;

/**
 * Project: java8-examples
 * FileName: UseInstance
 * Date: 2015-11-20
 * Time: 오전 9:30
 * Author: Hades Lee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
@FunctionalInterface
public interface UseInstance<T, X extends Throwable> {
    void accept(T instance) throws X;
}
