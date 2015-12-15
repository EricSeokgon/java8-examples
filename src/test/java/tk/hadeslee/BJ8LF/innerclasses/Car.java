package tk.hadeslee.BJ8LF.innerclasses;

/**
 * Project: java8-examples
 * FileName: Car
 * Date: 2015-12-15
 * Time: 오전 9:26
 * Author: Hades Lee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Car {
    //A member variable for the Car class
    private int year;

    //A member inner class named Tire
    public class Tire {
        //A member variable for the Tire class
        private double radius;

        //Constructor for the Tire class
        public Tire(double radius) {
            this.radius = radius;
        }
    }
}
