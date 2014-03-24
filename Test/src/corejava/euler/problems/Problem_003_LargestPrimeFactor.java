package corejava.euler.problems;

import java.util.ArrayList;
import java.util.List;

/**
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * 
 * What is the largest prime factor of the number 600851475143 ?
 * 
 * @author gandhip
 * 
 */
public class Problem_003_LargestPrimeFactor {

	static final long number = 600851475143l;

	public static void main(String[] args) {
		System.out.println(getLargestPrimeFactorBackward(number));
	}

	public static long getLargestPrimeFactorBackward(long number) {
		long largestPrime = 1;
		for (long i = 2;; i++) {
			if (number % i == 0 && isPrime(number / i)) {
				largestPrime = number / i;
				break;
			}
		}
		return largestPrime;
	}

	public static long getLargestPrimeFactorForward(long number) {
		List<Long> primes = getAllPossiblePrimes(number);
		long largestPrime = 0;
		for (long prime : primes) {
			if (number % prime == 0) {
				largestPrime = prime;
			}
		}
		return largestPrime;
	}

	public static List<Long> getAllPossiblePrimes(long number) {
		List<Long> primeList = new ArrayList<Long>();
		long index = number / 2;
		for (long i = 2; i < index; i++) {
			if (isPrime(i)) {
				primeList.add(i);
				System.out.println("Prime Added: " + i);
			}
		}

		return primeList;
	}

	public static boolean isPrime(final long input) {
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
