package tk.hadeslee.BJ8LF.reflection;


import tk.hadeslee.Lambda_Expressions.String_Compararors_Filters.Person;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;



/**
 * Project: java8-examples
 * FileName: FieldReflection
 * Date: 2015-12-27
 * Time: 오전 12:00
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class FieldReflection {
    public static void main(String[] args) {
        Class<Person> c = Person.class;

        ArrayList<String> fieldsDesciption = getDeclaredfieldsList(c);

        System.out.println("Declareds Fields for " + c.getName());
        for (String desc : fieldsDesciption) {
            System.out.println(desc);
        }

        fieldsDesciption = getFieldsList(c);

        System.out.println("\nAccessible Fields for " + c.getName());
        for (String desc : fieldsDesciption) {
            System.out.println(desc);
        }
    }

    private static ArrayList<String> getDeclaredfieldsList(Class c) {
        Field[] fields = c.getDeclaredFields();
        ArrayList<String> fieldsList = getFieldsDesciption(fields);
        return fieldsList;
    }

    private static ArrayList<String> getFieldsList(Class c) {
        Field[] fields = c.getFields();
        ArrayList<String> fieldsList = getFieldsDesciption(fields);
        return fieldsList;
    }

    public static ArrayList<String> getFieldsDesciption(Field[] fields) {
        ArrayList<String> fieldList = new ArrayList<>();
        for (Field f : fields) {
            int mod = f.getModifiers() & Modifier.fieldModifiers();
            String modifiers = Modifier.toString(mod);

            Class<?> type = f.getType();
            String typeName = type.getTypeName();

            String fieldName = f.getName();

            fieldList.add(modifiers + " " + typeName + " " + fieldName);
        }
        return fieldList;
    }

}
