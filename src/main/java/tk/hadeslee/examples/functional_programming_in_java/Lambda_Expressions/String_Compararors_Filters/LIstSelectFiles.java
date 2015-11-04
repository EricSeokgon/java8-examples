package tk.hadeslee.examples.functional_programming_in_java.Lambda_Expressions.String_Compararors_Filters;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Project: java8-examples
 * FileName: LIstSelectFiles
 * Date: 2015-11-04
 * Time: 오전 9:43
 * Author: Hades Lee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class LIstSelectFiles {
    public static void main(String[] args) throws IOException {
        final String[] files =
                new File("src").list(new java.io.FilenameFilter() {
                    public boolean accept(final File dir, final String name) {
                        return name.endsWith(".java");
                    }
                });
        System.out.println(files);

        Files.newDirectoryStream(
                Paths.get("src\\main\\java\\tk\\hadeslee\\examples\\functional_programming_in_java\\Lambda_Expressions\\String_Compararors_Filters"), path -> path.toString().endsWith(".java"))
                .forEach(System.out::println);
    }
}
