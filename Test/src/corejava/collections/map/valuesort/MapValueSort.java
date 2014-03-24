package corejava.collections.map.valuesort;

import java.util.Comparator;
import java.util.Map;

public class MapValueSort implements Comparator<String> {

    Map<String, Integer> employeeSalaryMap;

    public MapValueSort(final Map<String, Integer> employeeSalaryMap) {
        this.employeeSalaryMap = employeeSalaryMap;
    }

    @Override
    public int compare(final String o1, final String o2) {

        if (employeeSalaryMap.get(o1).compareTo(employeeSalaryMap.get(o2)) == 0) {
            return o1.compareTo(o2);
        }

        return employeeSalaryMap.get(o1).compareTo(employeeSalaryMap.get(o2));
    }

}
