package tk.hadeslee.BJ8LF.innerraclasses;

/**
 * Project: java8-examples
 * FileName: RandomLocal
 * Date: 2015-12-18
 * Time: 오전 9:51
 * Author: Hades Lee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class RandomLocal {
    public RandomInteger getRandomInteger() {
        class RandomIntegerLocal extends RandomInteger {
            @Override
            public int getValue() {
                long n1 = rand.nextInt();
                long n2 = rand.nextInt();

                int value = (int) ((n1 + n2) / 2);
                return value;
            }
        }
        return new RandomIntegerLocal();
    }
}
