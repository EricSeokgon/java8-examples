package tk.hadeslee.Lambda_Expressions.Designing_with_Lambda_Expreesions;

public interface FastFly extends Fly{
    default void takeOff(){System.out.println("FastFly::cruise");}

}
