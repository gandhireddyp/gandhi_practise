package corejava.util;

import java.util.ArrayList;
import java.util.List;

public class TestList {

    public static void main(final String[] args) {
        final List<String> stringList = new ArrayList<String>();

        for (final Object element : stringList) {
            final String string = (String) element;

        }
    }

}
