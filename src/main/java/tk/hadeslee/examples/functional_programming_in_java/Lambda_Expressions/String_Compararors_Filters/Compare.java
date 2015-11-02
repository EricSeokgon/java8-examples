package tk.hadeslee.examples.functional_programming_in_java.Lambda_Expressions.String_Compararors_Filters;

import static java.util.stream.Collectors.*;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Project: java8-examples
 * FileName: Compare
 * Date: 2015-11-01
 * Time: 오전 12:29
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Compare {

    public static void main(String[] args) {
        final List<Person> people = Arrays.asList(
                new Person("John", 20),
                new Person("Sara", 21),
                new Person("Jane", 21),
                new Person("Greg", 35));

        Comparator<Person> compareAscending = (person1, person2) ->
                person1.ageDifference(person2);
        Comparator<Person> compareDescending = compareAscending.reversed();

        List<Person> ascendingAge =
                people.stream()
                        .sorted((person1, person2) -> person1.ageDifference(person2))
                        .collect(toList());
        printPeople("Sorted in ascending order of age: ", ascendingAge);
        System.out.println();

        printPeople("Sorted in descending order of age: ",
                people.stream()
                        .sorted((person1, person2) -> person2.ageDifference(person1))
                        .collect(toList()));

        printPeople("Sorted in ascending order of age: ",
                people.stream()
                        .sorted(compareAscending)
                        .collect(toList()));

        printPeople("Sorted in descending order of age: ",
                people.stream()
                        .sorted(compareDescending)
                        .collect(toList()));

        printPeople("Sorted in ascending order of name: ",
                people.stream()
                        .sorted((person1, person2) ->
                                person1.getName().compareTo(person2.getName()))
                        .collect(toList()));

        people.stream()
                .min(Person::ageDifference)
                .ifPresent(yungest -> System.out.println("Youngest: " + yungest));

        people.stream()
                .max(Person::ageDifference)
                .ifPresent(eldest -> System.out.println("Eldest: " + eldest));

    }


    public static void printPeople(
            final String message, final List<Person> people) {
        System.out.println(message);
        people.forEach(System.out::println);
    }


}
