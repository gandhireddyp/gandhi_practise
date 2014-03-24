package corejava.datastructure.questions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RemoveLesserElementsInList {

	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<Integer>();
		int number = 6;

		intList.add(5);
		intList.add(6);
		intList.add(3);
		intList.add(2);
		intList.add(1);
		intList.add(9);
		intList.add(10);
		intList.add(4);
		intList.add(8);
		intList.add(7);

		removeByDeleting(intList, number);

		
	}

	public static void removeByDeleting(List<Integer> intList, int number) {
		Iterator<Integer> it = intList.iterator();

		while (it.hasNext()) {
			Integer element = it.next();
			if (element < number) {
				System.out.println("Removing : " + element);
				it.remove();
			}
		}

		for (Integer integer : intList) {
			System.out.println(integer);
		}
	}

	public static void removeByCopying(List<Integer> intList, int number) {


	}
}
