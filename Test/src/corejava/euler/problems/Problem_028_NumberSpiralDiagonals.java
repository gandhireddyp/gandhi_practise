package corejava.euler.problems;

/**
 * 
 * Starting with the number 1 and moving to the right in a clockwise direction a
 * 5 by 5 spiral is formed as follows:
 * 
 * 21 22 23 24 25
 * 20  7  8  9 10
 * 19  6  1  2 11
 * 18  5  4  3 12
 * 17 16 15 14 13
 * 
 * 
 * It can be verified that the sum of the numbers on the diagonals is 101.
 * (1+3+5+7+9+13+17+21+25)
 * 
 * What is the sum of the numbers on the diagonals in a 1001 by 1001 spiral
 * formed in the same way?
 * 
 * 
 * @author gandhip
 * 
 */
public class Problem_028_NumberSpiralDiagonals {

	public static void main(String[] args) {
		System.out.println(sumOfSpiralDiagonal(1001));
	}

	/**
	 * The number of sides of the spiral can only be odd number (3,5,7... etc).
	 * Hence for every loop, we need to loop by incrementing 2.
	 * 
	 * for every individual square, there can only be 4 diagonal number. So for
	 * every cube we need to iterate for 4 numbers
	 * 
	 * For every square, the last diagonal element is the (number of
	 * elements)^2.
	 * 
	 * Next diagonal element can be obtained by adding the previous diagonal
	 * element with the (number of elements in square-1)
	 * 
	 * 
	 * @param n
	 * @return
	 */
	public static long sumOfSpiralDiagonal(int n) {
		long sum = 1;
		int lastDiagonalElement = 1;
		for (int i = 3; i <= n; i = i + 2) {
			for (int j = 1; j <= 4; j++) {
				lastDiagonalElement = lastDiagonalElement + i - 1;
				sum = sum + lastDiagonalElement;
			}
		}
		return sum;
	}

	public static long getLastElementInSpiral(long n) {
		return n * n;
	}

}
