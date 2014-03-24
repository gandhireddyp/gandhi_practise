package corejava.euler.problems;

import java.util.Date;

public class Problem_007_10001stPrime {

	public static void main(String[] args) {
		long startDate = new Date().getTime();
		System.out.println(findNthPrimeNumber(10001));
		long endDate = new Date().getTime();
		System.out.println("Time taken " + (endDate - startDate));
	}

	public static long findNthPrimeNumber(int n) {
		long primeNumber = 2;
		int i = 1;
		for (int number = 3; i < n; number = number + 2) {
			if (isPrime1(number)) {
				primeNumber = number;
				i++;
			}
		}
		return primeNumber;
	}

	public static boolean isPrime1(final long input) {
		boolean flag = true;
		final int squareRoot = (int) Math.sqrt(input);
		for (long i = 2; i <= squareRoot; i++) {
			if (input % i == 0) {
				flag = false;
				break;
			}
		}
		return flag;
	}

}
