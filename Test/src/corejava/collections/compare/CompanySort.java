package corejava.collections.compare;

import java.util.Comparator;

public class CompanySort implements Comparator<Employee> {

    @Override
    public int compare(final Employee o1, final Employee o2) {
        return o1.getCompany().compareTo(o2.getCompany());
    }
}
