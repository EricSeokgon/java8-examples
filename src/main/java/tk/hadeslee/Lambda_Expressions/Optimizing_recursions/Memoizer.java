package tk.hadeslee.Lambda_Expressions.Optimizing_recursions;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * Project: java8-examples
 * FileName: Memoizer
 * Date: 2015-12-03
 * Time: 오전 9:45
 * Author: Hades Lee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Memoizer {
    public static <T, R> R callMemoized(
            final BiFunction<Function<T, R>, T, R> function, final T input) {
        Function<T, R> memoized = new Function<T, R>() {
            private final Map<T, R> store = new HashMap<>();

            public R apply(final T input) {
                return store.computeIfAbsent(input, key -> function.apply(this, key));
            }
        };
        return memoized.apply(input);
    }

}
