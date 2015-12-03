package tk.hadeslee.Lambda_Expressions.Being_lazy;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Project: java8-examples
 * FileName: LazyStreams
 * Date: 2015-11-26
 * Time: 오전 9:24
 * Author: Hades Lee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class LazyStreams {
    private static int length(final String name) {
        System.out.println("getting length for " + name);
        return name.length();
    }

    private static String toUpper(final String name) {
        System.out.println("converting to uppercase: " + name);
        return name.toUpperCase();
    }

    public static void main(final String[] args) {
        List<String> names = Arrays.asList("Brad", "Kate", "Kim", "Jack", "Joe", "Mike", "Susan", "George", "Robert", "Julia", "Parker", "Benson");

        final String firstNameWith3Letters = names.stream()
                .filter(name -> length(name) == 3)
                .map(name -> toUpper(name))
                .findFirst()
                .get();

        System.out.println(firstNameWith3Letters);

        Stream<String> namesWith3Letters =
                names.stream()
                        .filter(name -> length(name) == 3)
                        .map(name -> toUpper(name));
        System.out.println("Stream created, filtered, mapped...");
        System.out.println("ready to call findFirst...");

        final String firstNameWith3Letters2 =
                namesWith3Letters.findFirst().get();
        System.out.println(firstNameWith3Letters2);


    }
}
