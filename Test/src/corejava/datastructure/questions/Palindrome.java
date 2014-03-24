package corejava.datastructure.questions;

public class Palindrome {

    public static void main(final String[] args) {

        System.out.println("1234 is Palindrome : " + isPalindrome(1234));
        System.out.println("1221 is Palindrome : " + isPalindrome(1221));
        
        //######################  String Palindrome  #################
        System.out.println("ABCDE is a palindrome :: "+ isPalindrome("ABCDE"));
		System.out.println("ABCDEDCBA is a palindrome :: "+ isPalindrome("ABCDEDCBA"));
    }

    public static boolean isPalindrome(final int input) {
        if (input == reverse(input)) {
            return true;
        }

        return false;
    }

    public static boolean isPalindrome(String input)
	{
		if(input.equals(reverse(input)))
		{
			return true;
		}
		return false;
	}
	
	private static String reverse(String input)
	{
		return new StringBuffer(input).reverse().toString();
	}
    private static int reverse(int input) {
        int reverse = 0;
        while (input != 0) {
            reverse = reverse * 10 + input % 10;
            input = input / 10;
        }
        return reverse;
    }

}
