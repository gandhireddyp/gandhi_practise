package corejava.euler.problems;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/**
 * 
 * Let d(n) be defined as the sum of proper divisors of n (numbers less than n
 * which divide evenly into n). If d(a) = b and d(b) = a, where a ≠ b, then a
 * and b are an amicable pair and each of a and b are called amicable numbers.
 * 
 * For example, the proper divisors of 220 are 1, 2, 4, 5, 10, 11, 20, 22, 44,
 * 55 and 110; therefore d(220) = 284. The proper divisors of 284 are 1, 2, 4,
 * 71 and 142; so d(284) = 220.
 * 
 * Evaluate the sum of all the amicable numbers under 10000.
 * 
 * 
 * 
 * @author gandhip
 * 
 */
public class Problem_021_AmicableNumbers {

	public static void main(String[] args) {
		System.out.println(getDivisorSumMap(10000));
		sumOfAmicableNumbers(10000);
	}

	public static int sumOfAmicableNumbers(int n) {
		Set<Integer> amicableSet = getAmicableNumbers(n);
		System.out.println(amicableSet);

		int sum = 0;
		for (Integer element : amicableSet) {
			sum = sum + element;
		}
		System.out.println("Sum Of Amicable Numbers below " + n + " is " + sum);
		return sum;
	}

	public static Set<Integer> getAmicableNumbers(int n) {
		Set<Integer> amicableList = new LinkedHashSet<Integer>();
		Map<Integer, Integer> divisorSumMap = getDivisorSumMap(n);
		Set<Integer> it = divisorSumMap.keySet();
		for (Integer key : it) {
			if (key.equals(divisorSumMap.get(divisorSumMap.get(key)))
					&& !key.equals(divisorSumMap.get(key))) {
				System.out.println("Amicable Keys : " + key + ":"
						+ divisorSumMap.get(key));
				amicableList.add(key);
				amicableList.add(divisorSumMap.get(key));
			}
		}
		return amicableList;
	}

	public static Map<Integer, Integer> getDivisorSumMap(int n) {
		Map<Integer, Integer> divisorsMap = new LinkedHashMap<Integer, Integer>();
		for (int i = 2; i <= n; i++) {
			divisorsMap.put(i, getSumOfDivisors(i));
		}
		return divisorsMap;
	}

	public static int getSumOfDivisors(int n) {
		int sum = 0;
		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				sum = sum + i;
			}
		}
		return sum;
	}

}
