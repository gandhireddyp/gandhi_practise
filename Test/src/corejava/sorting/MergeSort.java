package corejava.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {

    static int numberOfComparisons = 0;

    public static void main(final String[] args) {
        final String[] strArray = {"XYZ", "PQR", "JKL", "DEF", "GHI", "ABC", "MNO", "REM"};
        final MergeSort mergeSort = new MergeSort();
        printStringArray(mergeSort.mergeSort(Arrays.asList(strArray)));
        System.out.println("Number of Comparisons ::" + numberOfComparisons);
    }

    public List<String> mergeSort(final List<String> inputStringArray) {

        if (inputStringArray.size() <= 1) {
            return inputStringArray;
        }

        final int middleIndex = inputStringArray.size() / 2;
        List<String> leftArray = inputStringArray.subList(0, middleIndex);
        List<String> rightArray = inputStringArray.subList(middleIndex, inputStringArray.size());
        System.out.print("Left Array :: ");
        printStringArray(leftArray);
        System.out.print("Right Array :: ");
        printStringArray(rightArray);
        leftArray = mergeSort(leftArray);
        rightArray = mergeSort(rightArray);
        System.out.print("Sorted Left Array :: ");
        printStringArray(leftArray);
        System.out.print("Sorted Right Array :: ");
        printStringArray(rightArray);
        return merge(leftArray, rightArray);

    }

    public List<String> merge(List<String> leftArray, List<String> rightArray) {

        List<String> resultArray = null;
        // assign the element of the sublists to 'result' variable
        // until there is no element to merge.

        resultArray = new ArrayList<String>();
        while (leftArray.size() > 0 || rightArray.size() > 0) {
            numberOfComparisons++;
            if (leftArray.size() > 0 && rightArray.size() > 0) {
                if (leftArray.get(0).compareTo(rightArray.get(0)) <= 0) {
                    resultArray.add(leftArray.get(0));
                    leftArray = removefirstElementInArray(leftArray);
                } else {
                    resultArray.add(rightArray.get(0));
                    rightArray = removefirstElementInArray(rightArray);
                }
            } else if (leftArray.size() > 0) {
                resultArray.add(leftArray.get(0));
                leftArray = removefirstElementInArray(leftArray);
            } else if (rightArray.size() > 0) {
                resultArray.add(rightArray.get(0));
                rightArray = removefirstElementInArray(rightArray);
            }
        }
        return resultArray;
    }

    public static void printArray(final Integer[] intArray) {
        System.out.println();
        for (final Integer element : intArray) {
            System.out.print(element + ",");
        }
    }

    public List<String> removefirstElementInArray(final List<String> stringArray) {

        final String[] resultArray = new String[stringArray.size() - 1];

        for (int i = 0; i < resultArray.length; i++) {
            resultArray[i] = stringArray.get(i + 1);
        }

        return Arrays.asList(resultArray);

    }

    public static void printStringArray(final List<String> strArray) {

        for (final String element : strArray) {
            System.out.print(element + ",");
        }
        System.out.println();
    }
}
