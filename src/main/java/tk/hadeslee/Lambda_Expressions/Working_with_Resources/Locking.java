package tk.hadeslee.Lambda_Expressions.Working_with_Resources;


import sun.misc.Lock;
import static tk.hadeslee.Lambda_Expressions.Working_with_Resources.Locker.runLocked;

;

/**
 * Project: java8-examples
 * FileName: Locking
 * Date: 2015-11-23
 * Time: 오전 9:16
 * Author: Hades Lee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Locking {
    Lock lock = new Lock(); //or mock

    protected void setLock(final Lock mock) {
        lock = mock;
    }

    public void doOp1() throws InterruptedException {
        lock.lock();
        try{
            // ...critical code
        } finally {
            lock.unlock();
        }
    }

    public void doOp2() throws InterruptedException {
        runLocked(lock, () -> {/* ...critical code ...*/ });
    }

    public void doOp3() throws InterruptedException {
        runLocked(lock, () -> {/* ...critical code ...*/ });
    }

    public void doOp4() throws InterruptedException {
        runLocked(lock, () -> {/* ...critical code ...*/ });
    }


}
