package corejava.euler.problems;

/**
 * 
 * Surprisingly there are only three numbers that can be written as the sum of
 * fourth powers of their digits:
 * 
 * 1634 = 1^4 + 6^4 + 3^4 + 4^4
 * 
 * 8208 = 8^4 + 2^4 + 0^4 + 8^4
 * 
 * 9474 = 9^4 + 4^4 + 7^4 + 4^4
 * 
 * As 1 = 1^4 is not a sum it is not included.
 * 
 * The sum of these numbers is 1634 + 8208 + 9474 = 19316.
 * 
 * Find the sum of all the numbers that can be written as the sum of fifth
 * powers of their digits.
 * 
 * @author gandhip
 * 
 */
public class Problem_030_DigitFifthPowers {

	public static void main(String[] args) {
		System.out.println(sumOfAllElements());
	}

	/**
	 * The maximum value for one digit is 9^5 = 59049. We can find out the
	 * maximum possible sum for a given number of digits by multiplying 59049
	 * with the number of digits.
	 * 
	 * no 7 (or higher) digit number can be a possible solution since 7*9^5 is
	 * much less than 9999999. Hence, we try all 1 through 6 digit numbers using
	 * a brute force approach.
	 * 
	 * @return
	 */
	public static int sumOfAllElements() {
		int sum = 0;
		// 9^5=59049; Maximum possible sum for 6 digits=6*59049=354294
		for (int i = 2; i < 354294; i++) {
			int fifthPowerSum = getFifthPowerSum(i);
			if (i == fifthPowerSum) {
				System.out.println(i + "-->" + fifthPowerSum);
				sum = sum + i;
			}
		}
		return sum;
	}

	public static int getFifthPowerSum(int n) {
		int sum = 0;
		while (n != 0) {
			sum = sum + (int) Math.pow(n % 10, 5);
			n = n / 10;
		}
		return sum;
	}

}
