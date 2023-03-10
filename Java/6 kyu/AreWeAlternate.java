// https://www.codewars.com/kata/59325dc15dbb44b2440000af

public class Solution {
	public static boolean isAlt(String word) {

		String vowel = "[aeiou]";
		String cons = "[^aeiou]";
		String toMatch = "";

		String initial = Character.toString(word.charAt(0));
		if(initial.matches(vowel)) {
			for (int i = 0; i < word.length(); i++) {
				if (i % 2 == 0) {
					toMatch += vowel;
				} else {
					toMatch += cons;
				}
			}
		} else {
			for (int i = 0; i < word.length(); i++) {
				if (i % 2 == 0) {
					toMatch += cons;
				} else {
					toMatch += vowel;
				} 
			}
		}
		
		if (word.matches(toMatch)) {
			return true;
		} else {
			return false;
		}
	}
}