package corejava.numerics;

import java.util.Date;

public class Fibonacci {

    public static void main(final String[] args) {
        final long startTime = new Date().getTime();
        System.out.println(getFibIterative(50));
        final long endTime = new Date().getTime();
        System.out.println(endTime - startTime);

        final long startTime1 = new Date().getTime();
        System.out.println(getFibRecursive(50));
        final long endTime1 = new Date().getTime();
        System.out.println(endTime1 - startTime1);
    }

    public static long getFibIterative(final long input) {
        long result = 0;
        long f0 = 0;
        long f1 = 1;
        for (int i = 2; i <= input; i++) {
            result = f0 + f1;
            f0 = f1;
            f1 = result;
        }
        return result;
    }

    public static long getFibRecursive(final long input) {
        if (input <= 1) {
            return input;
        }
        return getFibRecursive(input - 1) + getFibRecursive(input - 2);
    }

}
