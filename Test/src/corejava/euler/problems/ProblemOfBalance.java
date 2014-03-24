package corejava.euler.problems;

/**
 * You have a array which has integer elements with different values in some
 * random order.
 * 
 * We need to balance the array so that the array becomes balanced.
 * 
 * We need to transfer the data only to either previous or next elements.
 * 
 * @author gandhip
 * 
 */
public class ProblemOfBalance {

	public static void main(String[] args) {
		int[] array = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println("Average :" + average(array));
	}

	public static int average(int[] intArray) {
		int sum = 0;
		for (int element : intArray) {
			sum = sum + element;
		}
		return sum / intArray.length;
	}

}
