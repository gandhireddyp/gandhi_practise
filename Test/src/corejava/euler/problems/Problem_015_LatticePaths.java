package corejava.euler.problems;

import java.util.List;

/**
 * 
 * Starting in the top left corner of a 2×2 grid, and only being able to move to
 * the right and down, there are exactly 6 routes to the bottom right corner.
 * 
 * How many such routes are there through a 20×20 grid?
 * 
 * 
 * the number of lattice paths are determined by (2n)!/(n!)^2 =
 * (2n*(2n-1)*....*(n+1)*n!)/(n!)^2
 * 
 * =(2n*(2n-1)*....*(n+1))/(n!)
 * 
 * @author gandhip
 * 
 */
public class Problem_015_LatticePaths {

	public static void main(String[] args) {
		System.out.println(getFactorial(20));
		System.out.println(getLatticePaths(20));
	}

	public static long getLatticePaths(long n) {
		long numerator = 1;
		long denominator = 1;
		for (long i = 2 * n; i > n; i--) {
			numerator = numerator * i;
		}
		System.out.println(numerator);
		denominator = getFactorial(n);
		System.out.println(denominator);
		return numerator / denominator;
	}

	public static long getFactorial(long n) {
		long factorial = 1;
		for (int i = 1; i <= n; i++) {
			factorial = factorial * i;
		}
		return factorial;
	}

}
