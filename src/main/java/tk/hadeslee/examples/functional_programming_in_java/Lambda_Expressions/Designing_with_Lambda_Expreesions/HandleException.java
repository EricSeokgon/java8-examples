package tk.hadeslee.examples.functional_programming_in_java.Lambda_Expressions.Designing_with_Lambda_Expreesions;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 * Project: java8-examples
 * FileName: HandleException
 * Date: 2015-11-17
 * Time: 오전 9:49
 * Author: Hades Lee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class HandleException {
    public static void main(String[] args) {
        List<String> paths = Arrays.asList("/usr", "/tmp");

        paths.stream()
                .map(path -> {
                    try {
                        return new File(path).getCanonicalPath();
                    } catch (IOException e) {
                        e.getMessage();
                    }
                })
                .forEach(System.out::println);
    }
}
