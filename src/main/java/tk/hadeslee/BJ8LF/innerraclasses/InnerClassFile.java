package tk.hadeslee.BJ8LF.innerraclasses;

/**
 * Project: java8-examples
 * FileName: InnerClassFile
 * Date: 2015-12-24
 * Time: 오전 9:51
 * Author: redfo
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class InnerClassFile {
    public class MemberInnerClass {

    }

    public static class StaticInnerClass {

    }

    public void testMethod1() {
        //A local class
        class LocalInnerClass {
            //A local class
            class LocalInnerClass2 {

            }
        }
        //A local class
        class AnotherLocalInnerClass {

        }

        //Anonymous Inner class
        new Object() {

        };
    }

    public void testMethod2() {
        //A local class. Its name is the same as a local class in testMethod1() method
        class AnotherLocalInnerClass {

        }

        //Another local class
        class TestLocalClass {

        }
    }
}
