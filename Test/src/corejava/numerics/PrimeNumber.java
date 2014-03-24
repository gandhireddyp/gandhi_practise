package corejava.numerics;

import java.util.Date;

public class PrimeNumber {

    public static void main(final String[] args) {
        final long startTime = new Date().getTime();
        System.out.println(isPrime(1000003));
        final long endTime = new Date().getTime();
        System.out.println(endTime - startTime);

        final long startTime1 = new Date().getTime();
        System.out.println(isPrime1(1000003));
        final long endTime1 = new Date().getTime();
        System.out.println(endTime1 - startTime1);
    }

    public static boolean isPrime(final long input) {
        boolean flag = true;
        for (long i = 2; i < input - 1; i++) {
            if (input % i == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    public static boolean isPrime1(final long input) {
        boolean flag = true;
        final int squareRoot = (int) Math.sqrt(input);
        for (long i = 2; i <= squareRoot; i++) {
            if (input % i == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}
