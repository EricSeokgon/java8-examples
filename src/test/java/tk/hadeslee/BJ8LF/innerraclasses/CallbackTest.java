package tk.hadeslee.BJ8LF.innerraclasses;

import java.util.ArrayList;

/**
 * Project: java8-examples
 * FileName: CallbackTest
 * Date: 2015-12-24
 * Time: 오전 10:37
 * Author: redfo
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class CallbackTest {
    //To hold all registered Callback objects
    private ArrayList<Callable> callableList = new ArrayList<>();

    public static void main(String[] args) {
        CallbackTest cbt = new CallbackTest();

        //Create three callable object and register them
        Callable c1 = cbt.generateCallable(1);
    }

    private void callback() {
        int count = this.callableList.size();

        for (int i = 0; i < count; i++) {
            Callable c = this.callableList.get(i);
            c.call();
        }
    }


    public void register(Callable c) {
        this.callableList.add(c);
    }

    private Callable generateCallable(int no) {
        Callable c = new Callable() {
            public void call() {
                System.out.println("Called #" + no);
            }
        };
        return c;
    }

}