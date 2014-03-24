package corejava.euler.problems;

import java.io.ObjectInputStream.GetField;
import java.util.Date;

/**
 * 
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we
 * get 3, 5, 6 and 9. The sum of these multiples is 23. Find the sum of all the
 * multiples of 3 or 5 below 1000.
 */
public class Problem_001_MultiplesOf3And5 {

	public static void main(String[] args) {
		final int maxNumber = 100000;
		long startDate = new Date().getTime();
		System.out.println(getMultipleByForce(maxNumber));
		long endDate = new Date().getTime();
		System.out.println("Time taken by forceful " + (endDate - startDate));
		startDate = new Date().getTime();
		System.out.println(getMultipleByLogic(maxNumber));
		endDate = new Date().getTime();
		System.out.println("Time taken by Logic " + (endDate - startDate));
	}

	public static long getMultipleByForce(int maxNumber) {
		long sum = 0;
		for (long i = 1; i < maxNumber; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum = sum + i;
			}
		}
		return sum;
	}

	public static long getMultipleByLogic(int maxNumber) {
		long sum = 0;
		int numberOfMultiplesOf_3 = (maxNumber - 1) / 3;
		int numberOfMultiplesOf_5 = (maxNumber - 1) / 5;
		int numberOfMultiplesOf_15 = (maxNumber - 1) / 15;
		sum = 3 * getSumOfFirst_n_Number(numberOfMultiplesOf_3) + 5
				* getSumOfFirst_n_Number(numberOfMultiplesOf_5) - 15
				* (getSumOfFirst_n_Number(numberOfMultiplesOf_15));
		return sum;
	}

	public static long getSumOfFirst_n_Number(int n) {
		long sum = 0;
		sum = (n * (n + 1)) / 2;
		return sum;
	}
}
