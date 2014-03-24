package corejava.collections.compare;

import java.util.Comparator;

public class IdSort implements Comparator<Employee> {
    @Override
    public int compare(final Employee o1, final Employee o2) {
        return ((Integer) o1.getId()).compareTo(o2.getId());
    }
}
