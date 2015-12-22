package tk.hadeslee.BJ8LF.innerraclasses;

/**
 * Project: java8-examples
 * FileName: ComputerAccessory
 * Date: 2015-12-22
 * Time: 오전 9:05
 * Author: redfo
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class ComputerAccessory {
    //Static member class - Monitor
    public static class Monitor {
        private int size;

        public Monitor(int size) {
            this.size = size;
        }

        public String toString() {
            return "Monitor - size:" + this.size + " inch";
        }
    }

    public static class keyboard {
        private int key;

        public keyboard(int key) {
            this.key = key;
        }

        public String toString() {
            return "keyboard - Keys:" + this.key;
        }
    }
}
