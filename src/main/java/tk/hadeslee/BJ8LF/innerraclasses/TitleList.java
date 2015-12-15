package tk.hadeslee.BJ8LF.innerraclasses;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Project: java8-examples
 * FileName: TitleList
 * Date: 2015-12-16
 * Time: 오전 12:38
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class TitleList {
    private ArrayList<String> titleList = new ArrayList<>();

    public void addTitle(String titile) {
        titleList.add(titile);
    }

    public void removeTitle(String titile) {
        titleList.remove(titile);
    }

    public Iterator<String> titleIterator() {
        class TitleIterator implements Iterator<String> {
            int count = 0;

            @Override
            public boolean hasNext() {
                return (count < titleList.size());
            }

            @Override
            public String next() {
                return titleList.get(count++);
            }
        }
        TitleIterator titleIterator = new TitleIterator();
        return titleIterator;
    }
}
