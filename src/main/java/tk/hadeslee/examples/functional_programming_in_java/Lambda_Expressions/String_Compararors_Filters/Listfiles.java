package tk.hadeslee.examples.functional_programming_in_java.Lambda_Expressions.String_Compararors_Filters;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Project: java8-examples
 * FileName: Listfiles
 * Date: 2015-11-04
 * Time: 오전 9:29
 * Author: Hades Lee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Listfiles {
    public static void main(String[] args) throws IOException {
        Files.list(Paths.get("."))
                .filter(Files::isDirectory)
                .forEach(System.out::println);
    }
}
