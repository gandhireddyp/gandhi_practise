package corejava.sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortList {

    static String[] strArray = {"XYZ", "PQR", "PQR", "JKL", "DEF", "GHI", "ABC", "MNO"};
    static List<String> strList = Arrays.asList(strArray);

    public SortList() {
    }

    public static void main(final String[] args) {
        Collections.sort(strList);
        for (final String element : strList) {
            System.out.println(element);
        }
    }
}
