package corejava.euler.problems;

/**
 * 
 * 2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
 * 
 * What is the sum of the digits of the number 2^1000?
 * 
 * 
 * @author gandhip
 * 
 */
public class Problem_016_PowerDigitSum {

	public static void main(String[] args) {
		System.out.println(Long.MAX_VALUE);
		System.out.println(Double.MAX_VALUE);
		double powerValue = Math.pow(2, 1000);
		long sum = 0;
		double temp = powerValue;
		while (temp != 0) {
			sum = sum + (long) (temp % 10);
			temp = temp / 10;
		}
		System.out.println("Value : " + powerValue);
		System.out.println("Sum: " + sum);
	}
}
