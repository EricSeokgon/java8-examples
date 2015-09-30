import java.util.Arrays;
import java.util.List;

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
        for (Integer number : numbers) {
            stringBuilder.append(number).append(" : ");
        }
        if (stringBuilder.length() > 0) {
            stringBuilder.delete(stringBuilder.length() - 3, stringBuilder.length());
        }
        System.out.println(stringBuilder.toString());
    }
}
