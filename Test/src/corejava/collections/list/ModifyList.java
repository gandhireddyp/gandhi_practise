package corejava.collections.list;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ModifyList {

    static String[] strArray = {"XYZ", "PQR", "PQR", "JKL", "DEF", "GHI", "ABC", "MNO"};
    static List<String> strList = Arrays.asList(strArray);
    static Set<String> strSet = new HashSet<String>();

    public static void main(final String[] args) {
        strSet.addAll(strList);
        try {
            addElementsDirectly();
        } catch (final Exception e) {
        }
        System.out.println("########################### AFter adding Directly ##################################");
        addElementsIterator();
        System.out.println("########################### AFter adding Iteration ##################################");
        addElementsToImmutableList();
    }

    private static void addElementsDirectly() {
        for (final String element : strSet) {
            strSet.add("BCD");
            System.out.println(element);
        }
    }

    private static void addElementsIterator() {
        final Iterator<String> it = strList.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
            strList.add("BCD");
        }
    }

    private static void addElementsToImmutableList() {
        final Set<String> unmodifyList = Collections.unmodifiableSet(strSet);
        final Iterator<String> it = unmodifyList.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
            unmodifyList.add("BCD");
        }
    }

}
