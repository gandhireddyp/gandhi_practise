package corejava.datastructure.questions;

import java.util.Iterator;
import java.util.LinkedList;

public class FindThirdLastElement {

    public static void main(final String[] args) {
        final LinkedList<Integer> l = new LinkedList<Integer>();
        l.add(2);
        l.add(9);
        l.add(4);
        l.add(5);
        l.add(3);
        l.add(1);
        l.add(40);
        l.add(50);
        l.add(60);

        if (l.size() < 3) {
            return;
        }

        final Iterator<Integer> i1 = l.iterator();
        final Iterator<Integer> i2 = l.iterator();

        i1.next();
        i1.next();
        i1.next();
        while (i1.hasNext()) {
            i2.next();
            i1.next();
        }

        System.out.println("Last Third Element :: " + i2.next());

    }
}
