package corejava.euler.problems;

import java.util.Date;

/**
 * 
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 * 
 * Find the sum of all the primes below two million.
 * 
 * 
 */
public class Problem_010_SummationOfPrimes {

	public static void main(String[] args) {
		long startDate = new Date().getTime();
		System.out.println(findSumOfPrimeNumbers(2000000));
		long endDate = new Date().getTime();
		System.out.println("Time taken " + (endDate - startDate));
	}

	public static long findSumOfPrimeNumbers(long n) {
		long sum = 2;
		for (int number = 3; number < n; number = number + 1) {
			if (isPrime1(number)) {
				sum = sum + number;
			}
		}
		return sum;
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
