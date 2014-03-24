package corejava.euler.problems;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * The following iterative sequence is defined for the set of positive integers:
 * 
 * n → n/2 (n is even) n → 3n + 1 (n is odd)
 * 
 * Using the rule above and starting with 13, we generate the following
 * sequence:
 * 
 * 13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
 * 
 * It can be seen that this sequence (starting at 13 and finishing at 1)
 * contains 10 terms. Although it has not been proved yet (Collatz Problem), it
 * is thought that all starting numbers finish at 1.
 * 
 * Which starting number, under one million, produces the longest chain?
 * 
 * NOTE: Once the chain starts the terms are allowed to go above one million.
 * 
 * 
 * @author gandhip
 * 
 */
public class Problem_014_LongestCollatzSequence {

	public static void main(String[] args) {
		List<Long> resultList = getLargestSequence(1000000);
		for (Long element : resultList) {
			System.out.print(element);
			System.out.print(" → ");
		}
		System.out.println();
		System.out.println("starting element : "+resultList.get(0));
		System.out.println("size : "+resultList.size());
	}

	public static List<Long> getLargestSequence(long maxNumber) {
		List<Long> LargestSequenceList = new ArrayList<Long>();
		for (long i = 2; i < maxNumber; i++) {
			List<Long> sequenceList = new ArrayList<Long>();
			long currentElement = i;
			while (currentElement != 1) {
				sequenceList.add(currentElement);
				currentElement = getNextNumber(currentElement);
			}
			sequenceList.add(1l);
			if (LargestSequenceList.size() < sequenceList.size()) {
				LargestSequenceList = sequenceList;
			}
		}
		return LargestSequenceList;
	}

	public static long getNextNumber(long n) {

		if (n % 2 == 0) {
			return n / 2;
		} else {
			return (3 * n) + 1;
		}
	}
}
