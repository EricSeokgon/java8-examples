package tk.hadeslee.BJ8LF.innerraclasses;

/**
 * Project: java8-examples
 * FileName: CarTest
 * Date: 2015-12-23
 * Time: 오전 9:11
 * Author: redfo
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class CarTest {
    public static void main(String[] args) {
        //Create an instance of Car with year as 2015
        Car c = new Car(2015);

        //Create a Tire for that car of 9.0 inch radius
        Car.Tire t = c.new Tire(9.0);

        System.out.println("Car's year:" + c.getYear());
        System.out.println("Car's tire radius:" + t.getRadius());
    }


}