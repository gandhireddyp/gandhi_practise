package corejava.euler.problems;

/**
 * 
 * n! means n × (n − 1) × ... × 3 × 2 × 1
 * 
 * For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800, and the sum of the
 * digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.
 * 
 * Find the sum of the digits in the number 100!
 * 
 * 
 * @author gandhip
 * 
 */
public class Problem_020_FactorialDigitSum {

	public static void main(String[] args) {
		System.out.println(getFactorialDigitsSum(10));
	}

	public static long getFactorialDigitsSum(int number) {
		long factorial = getFactorial(number);
		System.out.println("Factorial of " + number + " is " + factorial);
		return getSumOfDigits(factorial);
	}

	public static long getSumOfDigits(long n) {
		long sum = 0;
		while (n != 0) {
			sum = sum + n % 10;
			n = n / 10;
		}
		return sum;
	}

	public static long getFactorial(int n) {
		long factorial = 1;
		for (int i = 1; i <= n; i++) {
			factorial = factorial * i;
		}
		return factorial;
	}
}
