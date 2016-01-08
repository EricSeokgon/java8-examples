package tk.hadeslee.BJ8LF.reflection;

import java.lang.reflect.ReflectPermission;

/**
 * Project: java8-examples
 * FileName: ReflectPermissionTest
 * Date: 2016-01-08
 * Time: 오전 9:42
 * Author: redfo
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class ReflectPermissionTest {
    public static void main(String[] args) {
        try {
            // Create a permission object
            ReflectPermission rp = new ReflectPermission("suppressAccessChecks");
            // check for permission
            rp.checkGuard(null);
            System.out.println("Reflect permission is granted");
        } catch (SecurityException e) {
            System.out.println("Reflect permission is not granted");
        }
    }
}
