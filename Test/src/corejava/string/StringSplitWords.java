/**
 * 
 */
package corejava.string;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author gandhip
 * 
 */
public class StringSplitWords {

	public static Set<String> dictionary;

	static {
		dictionary = new HashSet<String>();
		dictionary.add("black");
		dictionary.add("blacki");
		dictionary.add("duck");
		dictionary.add("we");
		dictionary.add("are");
		dictionary.add("the");
		dictionary.add("boys");
		dictionary.add("i");
		dictionary.add("elephant");
		dictionary.add("ant");
		dictionary = Collections.unmodifiableSet(dictionary);
	}

	public static void main(String[] args) {
		System.out.println(getSplitWords("blackduckwearetheboyselephant"));
		System.out.println(breakUp("weare"));
	}

	/**
	 * This method returns all the strings within the inputString
	 * 
	 * @param str
	 * @return
	 */
	public static Set<String> getSplitWords(String str) {
		Set<String> resultSet = new HashSet<String>();
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j <= str.length(); j++) {
				String subString = str.substring(i, j);
				if (dictionary.contains(subString)) {
					resultSet.add(subString);
				}
			}
		}
		return resultSet;
	}

	/**
	 * This method returns the splitup of the input strings into two words.
	 * 
	 * @param compound
	 * @return
	 */
	public static List<String> breakUp(String compound) {
		List<String> words = new ArrayList<String>();
		int size = compound.length();
		for (int i = 2; i < size; i++) {
			String firstWord = compound.substring(0, i);
			if (dictionary.contains(firstWord)) {
				String secondWord = compound.substring(i);
				if (dictionary.contains(secondWord)) {
					words.add(firstWord);
					words.add(secondWord);
					break;
				}
			}
		}
		return words;
	}

}
