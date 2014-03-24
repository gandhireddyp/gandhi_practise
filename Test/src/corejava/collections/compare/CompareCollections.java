package corejava.collections.compare;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

public class CompareCollections {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		list1.add("ABC");
		list1.add("DEF");
		list1.add("GHI");
		list1.add("DEF");
		list1.add("ABC");
		list1.add("JKL");
		list1.add("ABC");
		list1.add("MNO");
		list1.add("ABC");
		list1.add("PQR");
		list1.add("ABC");
		list1.add("STU");
		list1.add("VWX");
		list1.add("YZ");
		list1.add("ABC");
		list1.add("DEF");
		List<String> list2 = new ArrayList<String>();
		list2.add("ABC");
		System.out.println(getDifference1(list1, list2));

		System.out.println(new LinkedHashSet<String>(list1));
	}

	public static Collection<String> getDifference(Collection<String> coll1,
			Collection<String> coll2) {
		Collection<String> resultCollection = new ArrayList<String>();
		coll1.removeAll(coll2);
		resultCollection.addAll(coll1);
		return resultCollection;
	}

	public static List<String> getDifference1(Collection<String> coll1,
			Collection<String> coll2) {
		List<String> resultCollection = new ArrayList<String>();
		for (String element1 : coll1) {
			if (!coll2.contains(element1)) {
				resultCollection.add(element1);
			}
		}
		return resultCollection;
	}

}
