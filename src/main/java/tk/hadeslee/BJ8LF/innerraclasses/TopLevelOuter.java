package tk.hadeslee.BJ8LF.innerraclasses;

/**
 * Project: java8-examples
 * FileName: TopLevelOuter
 * Date: 2015-12-23
 * Time: 오전 10:45
 * Author: redfo
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class TopLevelOuter {
    private int v1 = 100;

    //Here, only v1 is in scope
    public class InnerLevelOne {
        private int v2 = 200;

        //Here, only v1 and v2 are in socpe
        public class InnerLevelTwo {
            private int v3 = 300;

            //Here, only v1,v2 and v3 in scope
            public class InnerLevelThree {
                private int v4 = 400;

                //Here, all v1, v2, v3 and v4 are in scopr
            }
        }
    }
}
