package corejava.collections.compare;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * This class is used to test whether arrayList is faster or hashset is faster
 * for fetching the data.
 * 
 * @author gandhip
 * 
 */
public class CompareListAndSet {

	public static void main(String[] args) {
		int numberOfStrings = 5000000;
		List<String> strList = new ArrayList<String>(numberOfStrings);
		for (int i = 0; i <= numberOfStrings; i++) {
			strList.add(new StringBuilder("String").append(i).toString());
		}

		System.out.println("Added to List");
		Set<String> strSet = new HashSet<String>(strList);
		System.out.println("Completed adding to set");

		long startDate = new Date().getTime();
		System.out.println(strSet.contains("String3999999"));
		long endDate = new Date().getTime();
		System.out.println("Time taken for Set : " + (endDate - startDate));

		startDate = new Date().getTime();
		System.out.println(strList.contains("String4000000"));
		endDate = new Date().getTime();
		System.out.println("Time taken for List : " + (endDate - startDate));

	}

}
