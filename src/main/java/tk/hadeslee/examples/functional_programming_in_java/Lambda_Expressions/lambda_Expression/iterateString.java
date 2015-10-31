package tk.hadeslee.examples.functional_programming_in_java.Lambda_Expressions.lambda_Expression;

/**
 * Project: java8-examples
 * FileName: iterateString
 * Date: 2015-10-31
 * Time: 오전 12:33
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class iterateString {
    public static void main(String[] args) {
        final String str = "w00t";

        str.chars().forEach(ch-> System.out.println(ch));
        System.out.println();
        str.chars().forEach(System.out::println);
        System.out.println();
        str.chars().forEach(iterateString::printChar);
        System.out.println();
        str.chars()
                .mapToObj(ch->Character.valueOf((char)ch))
                .forEach(System.out::println);
        System.out.println();
        str.chars()
                .filter(ch->Character.isDigit(ch))
                .forEach(ch->printChar(ch));
        System.out.println();
        str.chars().filter(Character::isDigit).forEach(iterateString::printChar);

    }

    private static void printChar(int aChar){
        System.out.println((char)(aChar));
    }
}
