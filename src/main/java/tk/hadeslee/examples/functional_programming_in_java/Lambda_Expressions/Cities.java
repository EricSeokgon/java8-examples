package tk.hadeslee.examples.functional_programming_in_java.Lambda_Expressions;

import java.util.Arrays;
import java.util.List;

/**
 * Project: java8-examples
 * FileName: Cities
 * Date: 2015-10-17
 * Time: 오전 3:45
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Cities {
    public static void main(String[] args) {
        boolean found = false;

        //String[] cities = new String[0];
        final List<String> cities = Arrays.asList("Busan", "Seoul", "Daegu");
        for (String city : cities) {
            if (city.equals("Busan")) {
                found = true;
                break;
            }
        }
        System.out.println("Fund Busan?: " + found);
    }
}
