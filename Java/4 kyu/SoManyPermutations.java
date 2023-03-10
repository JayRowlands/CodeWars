// https://www.codewars.com/kata/5254ca2719453dcc0b00027d

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class Permutations {
	static Set<String> wordSet = new HashSet<String>();
	public static int count = 0;
	public static List<String> singlePermutations(String s) {
		wordSet.removeAll(wordSet);
		count = s.length();
		permutation("", s);
		return new ArrayList<String>(wordSet);
	}

	public static void permutation(String perm, String word) {
		if (word.isEmpty()) {
			if ((perm + word).length() == count) {
				System.out.println(perm+word);
				System.out.println((perm + word).length());
				wordSet.add(perm+word);
			}
		} else {
			for (int i = 0; i < word.length(); i++) {
				permutation(perm+word.charAt(i), word.substring(0, i)
						+ word.substring(i + 1, word.length()));
			}
		}
	}
}