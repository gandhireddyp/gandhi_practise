package corejava.numerics;

public class PalindromeNumber {

    public static void main(final String[] args) {

        final int palindrome = 12321;
        final int nonPalindrome = 12345;
        System.out.println(palindrome + " is a palindome : "
                + (palindrome == getReversedNumber(palindrome) ? true : false));
        System.out.println(nonPalindrome + " is a palindome : "
                + (nonPalindrome == getReversedNumber(nonPalindrome) ? true : false));
    }

    public static int getReversedNumber(int input) {
        int reverse = 0;
        while (input != 0) {
            reverse = reverse * 10 + input % 10;
            input = input / 10;
        }
        return reverse;
    }

}
