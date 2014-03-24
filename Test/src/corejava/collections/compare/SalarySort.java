package corejava.collections.compare;

import java.util.Comparator;

public class SalarySort implements Comparator<Employee> {

    @Override
    public int compare(final Employee o1, final Employee o2) {
        return ((Float) o1.getSalary()).compareTo(o2.getSalary());
    }
}
