package tk.hadeslee.examples.functional_programming_in_java.Lambda_Expressions.Optimizing_recursions;

/**
 * Project: java8-examples
 * FileName: TailCalls
 * Date: 2015-11-30
 * Time: 오전 9:16
 * Author: Hades Lee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class TailCalls {
    public static <T> TailCall<T> done(final T value){
        return new TailCall<T>() {
            @Override public boolean isComplete() { return true; }
            @Override public T result(){return value;}
            @Override public TailCall<T> apply(){
                throw  new Error("not implemented");
            }
        };
    }
}
