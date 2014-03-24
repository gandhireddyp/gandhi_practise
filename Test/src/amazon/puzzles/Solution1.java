package amazon.puzzles;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution1 {

    private static final String regExPattern = "[^a-zA-Z]";

    public static void main(final String[] args) throws Exception {

        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final String inpuString = br.readLine();

        final int numberOfWords = Integer.parseInt(br.readLine());
        final String[] wordsArray = new String[numberOfWords];
        for (int i = 0; i < numberOfWords; i++) {
            wordsArray[i] = br.readLine();
        }
        System.out.println("Input String: " + inpuString);
        System.out.println("Number of Words: " + numberOfWords);
        System.out.println("ITEMS are ::" + Arrays.asList(wordsArray));

    }

    private static String getTrimmedSubSegment(final String inputString) {
        return inputString.replaceAll(regExPattern, "");
    }

}
