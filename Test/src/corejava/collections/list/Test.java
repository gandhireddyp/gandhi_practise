package corejava.collections.list;

import java.util.LinkedList;
import java.util.List;

public class Test {

    public static void main(final String[] args) {
        final List<String> strList = new LinkedList<String>();

        strList.add("");

        final DoublyLinkedListGenerics<String> abc = new DoublyLinkedListGenerics<String>();
        abc.add("abc");
        abc.add("DEF");
        abc.add("xyz");
        abc.add("ghi");
        abc.add("jkl");
        abc.add("mno");

        abc.printList();
        System.out.println(abc.size());
        abc.Remove("xyz");
        System.out.println("################## After Removing --xyz-- ######################");
        abc.printList();
        System.out.println(abc.size());
        System.out.println(abc.getElement(5));
    }
}
