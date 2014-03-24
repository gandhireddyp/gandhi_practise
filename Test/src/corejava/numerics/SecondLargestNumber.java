package corejava.numerics;

public class SecondLargestNumber {

    public static void main(final String[] args) {
        final int arr[] = {1, 23, 47, 81, 92, 88, 52, 48, 56, 66, 65, 76, 71, 85, 49, 53, 56, 61, 65, 84};
        secondLargeNumber(arr);
    }

    public static void secondLargeNumber(final int[] arr) {
        int largest = arr[0];
        int secondLargest = arr[0];
        for (final int element : arr) {
            if (element > largest) {
                secondLargest = largest;
                largest = element;
            } else if (element > secondLargest) {
                secondLargest = element;
            }
        }
        System.out.println("second largest in array is:" + secondLargest);
    }

}
