package tk.hadeslee.Lambda_Expressions.String_Compararors_Filters;

import static java.util.stream.Collectors.*;
import static tk.hadeslee.Lambda_Expressions.String_Compararors_Filters.Compare.people;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

/**
 * Project: java8-examples
 * FileName: OlderThan20
 * Date: 2015-11-03
 * Time: 오전 10:13
 * Author: Hades Lee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class OlderThan20 {

    public static void main(String[] args) {
        List<Person> olderThan20_forEach = new ArrayList<>();
        people.stream()
                .filter(person -> person.getAge() > 20)
                .forEach(person -> olderThan20_forEach.add(person));
        System.out.println("People older than 20 (forEach): " + olderThan20_forEach);

        List<Person> olderThan20_collect =
                people.stream()
                        .filter(person -> person.getAge() > 20)
                        .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
        System.out.println("People older than 20 (collect): " + olderThan20_collect);

        List<Person> olderThan20_collect_concise =
                people.stream()
                        .filter(person -> person.getAge() > 20)
                        .collect(Collectors.toList());
        System.out.println("People older than 20 (collect_concise): " + olderThan20_collect_concise);

        Map<Integer, List<Person>> peopleByAge =
                people.stream()
                        .collect(groupingBy(Person::getAge));
        System.out.println("People grouped by age: " + peopleByAge);

        Map<Integer, List<String>> nameOfpeopleByAge =
                people.stream()
                        .collect(groupingBy(Person::getAge, mapping(Person::getName, toList())));
        System.out.println("People grouped by age: " + nameOfpeopleByAge);

        Comparator<Person> byAge = Comparator.comparing(Person::getAge);
        Map<Character, Optional<Person>> oldestPersonInEachAlphabet =
                people.stream()
                        .collect(groupingBy(person -> person.getName().charAt(0),
                                reducing(BinaryOperator.maxBy(byAge))));
        System.out.println("Oldest person in each alphabet: " + oldestPersonInEachAlphabet);


    }


}
