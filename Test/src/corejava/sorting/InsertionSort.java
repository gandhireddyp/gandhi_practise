package corejava.sorting;

public class InsertionSort {

    static final String[] strArray = {"XYZ", "PQR", "JKL", "DEF", "GHI", "ABC", "MNO"};

    public static void main(final String[] args) {
        System.out.print("Actual Array");
        printArray();
        insertionSort();
        printArray();
    }

    public static void insertionSort() {
        final int length = strArray.length;
        for (int i = 1; i < length; i++) {
            for (int j = i - 1; j >= 0; j--) {

                if (j == 0 && strArray[i].compareTo(strArray[j]) < 0) {
                    insertAtIndex(i, 0);
                    break;
                } else if (strArray[i].compareTo(strArray[j]) > 0) {
                    insertAtIndex(i, j + 1);
                    break;
                }
                printArray();
            }
        }
    }

    private static void insertAtIndex(final int srcIndex, final int destIndex) {
        final String tempValue = strArray[srcIndex];
        for (int i = srcIndex - 1; i >= destIndex; i--) {
            strArray[i + 1] = strArray[i];
        }
        strArray[destIndex] = tempValue;
    }

    public static void printArray() {
        System.out.println();
        for (final String element : strArray) {
            System.out.print(element + ",");
        }
    }
}
