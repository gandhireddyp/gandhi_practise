package corejava.euler.problems;

/**
 * 
 * The sum of the squares of the first ten natural numbers is,
 * 
 * 12 + 22 + ... + 102 = 385 The square of the sum of the first ten natural
 * numbers is,
 * 
 * (1 + 2 + ... + 10)2 = 552 = 3025 Hence the difference between the sum of the
 * squares of the first ten natural numbers and the square of the sum is 3025 −
 * 385 = 2640.
 * 
 * Find the difference between the sum of the squares of the first one hundred
 * natural numbers and the square of the sum.
 * 
 * Sum of first n natural numbers : n(n+1)/2
 * 
 * sum of squares of first n natural numbers : n(n+1)(2n+1)/6
 * 
 * difference of (sum of n numbers)2 and squares of n numbers is
 */
public class Problem_006_SumSquareDifference {

	static final long number = 100;
	
	public static void main(String[] args) {
		long sum=sumOfNaturalNumber(number);
		System.out.println(sum*sum - sumOfSquaresofNumbers(number));
	}

	public static long sumOfNaturalNumber(long n) {
		long sum = 0;
		sum = ((n * n) + n) / 2;
		return sum;
	}

	public static long sumOfSquaresofNumbers(long n) {
		long sum = 0;
		sum = (n * (n + 1) * ((2 * n) + 1)) / 6;
		return sum;
	}

}
