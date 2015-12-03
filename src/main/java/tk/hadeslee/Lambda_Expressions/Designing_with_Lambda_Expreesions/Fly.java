package tk.hadeslee.Lambda_Expressions.Designing_with_Lambda_Expreesions;

/**
 * Project: java8-examples
 * FileName: Fly
 * Date: 2015-11-12
 * Time: 오전 12:10
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public interface Fly {
    default void takeOff(){System.out.println("Fly::takeOff");}
    default void land(){System.out.println("Fly::land");}
    default void turn(){System.out.println("Fly::turn");}
    default void cruise(){System.out.println("Fly::cruise");}
}

