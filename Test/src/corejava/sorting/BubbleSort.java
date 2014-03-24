package corejava.sorting;

/**
 * Bubble Sort : Iterates over the list and places the least element first. Next
 * iterates over the remaining elements and sorts the second element
 * 
 * You can assume how lighter bubbles come to top
 * 
 * Time Complexity : n(n-1)/2 comparisons [what ever be the order of elements]
 * 
 * @author pullalarevug
 * 
 */
public class BubbleSort {

    final static String[] strArray = {"XYZ", "PQR", "PQR", "JKL", "DEF", "GHI", "ABC", "MNO"};

    public static void main(final String[] args) {

        bubbleSort();

        printArray();

    }

    public static void bubbleSort() {
        int numberOfComparisons = 0;
        final int length = strArray.length;
        for (int i = length; i > 1; i--) {
            for (int j = 1; j < i; j++) {
                numberOfComparisons++;
                if (strArray[j - 1].compareTo(strArray[j]) > 0) {
                    swap(j, j - 1);
                }
            }
            printArray();
        }

        System.out.println("number of comparisons " + numberOfComparisons);
    }

    public static void bubbleSort1() {
        int numberOfComparisons = 0;
        for (int i = 0; i < strArray.length; i++) {
            for (int j = strArray.length - 1; j > i; j--) {
                numberOfComparisons++;
                if (strArray[i].compareTo(strArray[j]) > 0) {
                    swap(i, j);
                }
            }
        }
        System.out.println("number of comparisons " + numberOfComparisons);
    }

    private static void swap(final int indexOne, final int indexTwo) {
        final String temp = strArray[indexOne];
        strArray[indexOne] = strArray[indexTwo];
        strArray[indexTwo] = temp;

    }

    public static void printArray() {
        System.out.println();
        for (final String element : strArray) {
            System.out.print(element + ",");
        }
    }
}
