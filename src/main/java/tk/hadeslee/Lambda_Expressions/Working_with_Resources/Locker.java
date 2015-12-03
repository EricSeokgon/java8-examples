package tk.hadeslee.Lambda_Expressions.Working_with_Resources;

import sun.misc.Lock;

/**
 * Project: java8-examples
 * FileName: Locker
 * Date: 2015-11-23
 * Time: 오전 9:21
 * Author: Hades Lee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Locker {
    public static void runLocked(Lock lock, Runnable block) throws InterruptedException {
        lock.lock();
        try {
            block.run();
        } finally {
            lock.unlock();
        }
    }
}
