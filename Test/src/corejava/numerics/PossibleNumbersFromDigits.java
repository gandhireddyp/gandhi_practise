package corejava.numerics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class PossibleNumbersFromDigits {

	private static int[] digits = { 0, 1, 2 };

	public static void main(String[] args) {
		System.out.println(getPossibleNumberSequences(new ArrayList<Integer>(
				Arrays.asList(1, 2, 3))));
	}

	public static List<List<Integer>> getPossibleNumberSequences(
			List<Integer> inputList) {
		List<List<Integer>> outputList = new ArrayList<List<Integer>>();
		List<Integer> tempInputList = inputList;
		if (inputList.size() == 2) {
			return getReversedNumber(inputList);
		} else {
			Iterator<Integer> tempIterator = inputList.iterator();
			while (tempIterator.hasNext()) {
				Integer startElement = tempIterator.next();
				tempInputList.remove(startElement);
				List<List<Integer>> tempList = getPossibleNumberSequences(tempInputList);
				for (List<Integer> eleList : tempList) {
					eleList.add(startElement);
				}
			}
		}
		return outputList;
	}

	public static List<List<Integer>> getReversedNumber(List<Integer> inputList) {
		List<List<Integer>> outputList = new ArrayList<List<Integer>>();
		List<Integer> reverseInputList = new ArrayList<Integer>();
		reverseInputList.add(inputList.get(1));
		reverseInputList.add(inputList.get(0));
		outputList.add(inputList);
		outputList.add(reverseInputList);
		return outputList;
	}
}
