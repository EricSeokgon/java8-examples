package tk.hadeslee.Lambda_Expressions.String_Compararors_Filters;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * Project: java8-examples
 * FileName: ListSubDirs
 * Date: 2015-11-05
 * Time: 오전 9:14
 * Author: Hades Lee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class ListSubDirs {
    public static void main(String[] args) {
        listTheHardWay();

    }

    public static void listTheHardWay() {
        List<File> files = new ArrayList<>();

        File[] filesInCurerentDir = new File(".").listFiles();
        for (File file : filesInCurerentDir) {
            File[] filesInSubDir = file.listFiles();
            if (filesInSubDir != null) {
                files.addAll(Arrays.asList(filesInSubDir));
            } else {
                files.add(file);
            }
        }
        System.out.println("Count: " + files.size());
    }

}
