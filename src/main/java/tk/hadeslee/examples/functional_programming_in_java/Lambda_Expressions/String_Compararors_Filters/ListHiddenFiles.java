package tk.hadeslee.examples.functional_programming_in_java.Lambda_Expressions.String_Compararors_Filters;

import java.io.File;

/**
 * Project: java8-examples
 * FileName: ListHiddenFiles
 * Date: 2015-11-04
 * Time: 오전 9:56
 * Author: Hades Lee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class ListHiddenFiles {
    public static void main(String[] args) {
        final File[] files = new File(".").listFiles(file -> file.isHidden());

        new File(".").listFiles(File::isHidden);
    }
}
