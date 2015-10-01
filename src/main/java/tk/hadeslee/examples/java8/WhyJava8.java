package tk.hadeslee.examples.java8;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.joining;

/**
 * Created by redfo on 2015-09-28.
 */
public class WhyJava8 {

    public static void main(String[] args) {
        final List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        final StringBuilder stringBuilder = new StringBuilder();
//        final int size = numbers.size();
//        for (int i = 0; i < size; i++) {
//            stringBuilder.append(numbers.get(i));
//            if (i != size - 1) {
//                stringBuilder.append(" : ");
//            }
//        }
        final String separator = " : ";
        for (Integer number : numbers) {
            stringBuilder.append(number).append(separator);
        }
        final int stringLenght = stringBuilder.length();
        if (stringLenght > 0) {
            stringBuilder.delete(stringLenght - separator.length(), stringLenght);
        }
        System.out.println(stringBuilder.toString());

        final String result = numbers.stream()
                .map(String::valueOf)
                .collect(joining(" : "));
        System.out.println(result);
    }
}
