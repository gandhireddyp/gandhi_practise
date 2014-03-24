package corejava.collections.map.valuesort;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Test {

    public static void main(final String[] args) {

        final Map<String, Integer> employeeSalaryMap = new HashMap<String, Integer>();
        employeeSalaryMap.put("Steven", 10);
        employeeSalaryMap.put("Gandhi", 6);
        employeeSalaryMap.put("Venky", 5);
        employeeSalaryMap.put("Venky1", 8);
        employeeSalaryMap.put("Sateesh", 7);

        final Map<String, Integer> salarySortedMap = new TreeMap<String, Integer>(new MapValueSort(employeeSalaryMap));

        salarySortedMap.putAll(employeeSalaryMap);

        final Set<String> keySet = salarySortedMap.keySet();

        for (final String key : keySet) {
            System.out.println(key + " : " + salarySortedMap.get(key));
        }
    }
}
