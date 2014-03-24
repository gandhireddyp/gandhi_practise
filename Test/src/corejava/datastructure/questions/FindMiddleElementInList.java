package corejava.datastructure.questions;

import java.util.Iterator;
import java.util.LinkedList;

public class FindMiddleElementInList {

    public static void main(final String args[]) {

        final LinkedList<Integer> l = new LinkedList<Integer>();
        l.add(2);
        l.add(9);
        l.add(4);
        l.add(5);
        l.add(3);
        l.add(1);
        l.add(40);

        final Iterator<Integer> i1 = l.iterator();
        final Iterator<Integer> i2 = l.iterator();

        int i = 0;
        int middle = 0;
        while (i1.hasNext()) {
            if (i % 2 == 0) {
                middle = i2.next();
            }
            i++;
            i1.next();
        }
        System.out.println("middle :: " + middle);
    }
}
