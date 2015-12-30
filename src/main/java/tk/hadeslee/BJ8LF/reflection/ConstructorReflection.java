package tk.hadeslee.BJ8LF.reflection;

import tk.hadeslee.Lambda_Expressions.String_Compararors_Filters.Person;

import java.lang.reflect.Constructor;
import java.util.ArrayList;

/**
 * Project: java8-examples
 * FileName: ConstructorReflection
 * Date: 2015-12-30
 * Time: 오전 9:33
 * Author: redfo
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class ConstructorReflection {
    public static void main(String[] args) {
        Class<Person> c = Person.class;
// Get the declared constructors
        System.out.println("Constructors for " + c.getName());
        Constructor[] constructors = c.getConstructors();
        ArrayList<String> constructDescList = getConstructorsDesciption(constructors);
        for (String desc : constructDescList) {
            System.out.println(desc);
        }
    }

    public static ArrayList<String> getConstructorsDesciption(Constructor[] constructors) {
        ArrayList<String> constructorList = new ArrayList<>();
        for (Constructor constructor : constructors) {
            String modifiers = ExecutableUtil.getModifiers(constructor);
            // Get the name of the constructor
            String constructorName = constructor.getName();
// Get the parameters of the constructor
            ArrayList<String> paramsList =
                    ExecutableUtil.getParameters(constructor);
            String params = ExecutableUtil.arrayListToString(paramsList, ",");
// Get the Exceptions thrown by the constructor
            String throwsClause = ExecutableUtil.getThrowsClause(constructor);
            constructorList.add(modifiers + " " + constructorName
                    + "(" + params + ") " + throwsClause);
        }
        return constructorList;
    }
}