package corejava.euler.problems;

import java.math.BigInteger;
import java.util.Date;

/**
 * A palindromic number reads the same both ways. The largest palindrome made
 * from the product of two 2-digit numbers is 9009 = 91 × 99.
 * 
 * Find the largest palindrome made from the product of two 3-digit numbers.
 * 
 * 
 * @author gandhip
 * 
 */
public class Problem_004_LargestPalindromeProduct {

	public static void main(String[] args) {
		System.out.println(isPalindromeNumber(121));

		long startDate = new Date().getTime();
		System.out.println(getLargestPalindroomeByForce());
		long endDate = new Date().getTime();
		System.out.println("Time taken " + (endDate - startDate));
		
		startDate = new Date().getTime();
		System.out.println(getLargestPalindroomeByLogic());
		endDate = new Date().getTime();
		System.out.println("Time taken " + (endDate - startDate));

	}

	public static long getLargestPalindroomeByForce() {
		long largestPalindrome = 0;
		for (long i = 100; i < 1000; i++) {
			for (long j = 100; j < 1000; j++) {
				long product = i * j;
				if (isPalindromeNumber(product) && product > largestPalindrome) {
					largestPalindrome = product;
				}
			}
		}
		return largestPalindrome;
	}

	/**
	 * 
	 * The palindrome can be written as: abccba1100c
	 * 
	 * Which then simpifies to: 100000a + 10000b + 1000c + 100c + 10b + a
	 * 
	 * And then: 100001a + 10010b +
	 * 
	 * Factoring out 11, you get: 11(9091a + 910b + 100c)
	 * 
	 * So the palindrome must be divisible by 11. Seeing as 11 is prime, at
	 * least one of the numbers must be divisible by 11.
	 * 
	 * @return
	 */
	public static long getLargestPalindroomeByLogic() {
		long largestPalindrome = 0;
		long minIndexOf_11 = 10; //11*10=110 (least 3 digit number divisible by 11)
		long maxIndexOf_11 = 90; //11*90=990 (largest 3 digit number divisible by 11)
		for (long i = minIndexOf_11; i <= maxIndexOf_11; i++) {
			long number = 11 * i;
			for (long j = 100; j < 1000; j++) {
				long product = number * j;
				if (isPalindromeNumber(product) && product > largestPalindrome) {
					largestPalindrome = product;
				}
			}
		}
		return largestPalindrome;
	}

	public static boolean isPalindromeNumber(long input) {
		long temp = input;
		long reverse = 0;
		while (temp != 0) {
			reverse = reverse * 10 + temp % 10;
			temp = temp / 10;
		}
		return reverse == input;
	}
}
