package tk.hadeslee.examples.functional_programming_in_java.Lambda_Expressions.String_Compararors_Filters;

import static tk.hadeslee.examples.functional_programming_in_java.Lambda_Expressions.String_Compararors_Filters.Compare.people;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
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
                        .collect(Collectors.groupingBy(Person::getAge));
        System.out.println("People grouped by age: " + peopleByAge);


    }


}
