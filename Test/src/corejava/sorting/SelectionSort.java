package corejava.sorting;

public class SelectionSort {

    static final String[] strArray = {"XYZ", "PQR", "JKL", "DEF", "GHI", "ABC", "MNO"};

    public static void main(final String[] args) {

        selectionSort();
        printArray();

    }

    private static void swap(final int indexOne, final int indexTwo) {
        final String temp = strArray[indexOne];
        strArray[indexOne] = strArray[indexTwo];
        strArray[indexTwo] = temp;
    }

    public static void selectionSort() {
        int numberOfComparisons = 0;

        for (int i = 0; i < strArray.length; i++) {
            int minimumIndex = i;
            for (int j = i; j < strArray.length; j++) {
                numberOfComparisons++;
                if (strArray[minimumIndex].compareTo(strArray[j]) > 0) {
                    minimumIndex = j;
                }
            }
            if (i != minimumIndex) {
                swap(i, minimumIndex);
            }
            printArray();
        }

        System.out.println("number of comparisons " + numberOfComparisons);
    }

    public static void printArray() {
        System.out.println();
        for (final String element : strArray) {
            System.out.print(element + ",");
        }
    }

}
