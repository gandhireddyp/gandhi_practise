package corejava.string;

public class StringReverse {

    static final String string = "GANDHI";

    public static void main(final String[] args) {
        System.out.println(reverseString1(string));
        System.out.println("#########################");
        System.out.println(reverseString2(string));
        System.out.println("#########################");
        System.out.println(reverseStringRecursive(string));
    }

    private static String reverseString1(final String input) {
        final int length = input.length();
        final char[] sourceArray = input.toCharArray();
        final char[] destArray = new char[length];
        String reverseString;
        for (int i = 0; i < length; i++) {
            destArray[i] = sourceArray[length - 1 - i];
        }
        reverseString = new String(destArray);
        return reverseString;
    }

    private static String reverseString2(final String input) {
        final StringBuilder reverseString = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            reverseString.append(input.charAt(i));
        }
        return reverseString.toString();
    }

    private static String reverseStringRecursive(final String input) {
        if (input.length() == 0) {
            return "";
        }
        return input.charAt(input.length() - 1) + reverseStringRecursive(input.substring(0, input.length() - 1));
    }

}
