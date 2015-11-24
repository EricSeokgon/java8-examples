package tk.hadeslee.examples.functional_programming_in_java.Lambda_Expressions.Being_lazy;

/**
 * Project: java8-examples
 * FileName: Holder
 * Date: 2015-11-24
 * Time: 오전 10:31
 * Author: Hades Lee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Holder {
    private Supplier<Heavy> heavy = () -> createAbdCacheHeavy();

    public Holder(){
        System.out.println("Holder created");
    }
    public Heavy getHeavy(){
        return heavy.get();
    }


    private synchronized Heavy createAbdCacheHeavy(){
        class HeavyFactory implements Supplier<Heavy>{
            private final Heavy heavyInstance = new Heavy();

            public Heavy get() { return heavyInstance; }
         }
        if (!HeavyFactory.class.isInstance(heavy)){
            heavy = new HeavyFactory();
        }
        return heavy.get();
    }

}
