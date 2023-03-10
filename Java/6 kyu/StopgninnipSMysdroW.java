// https://www.codewars.com/kata/5264d2b162488dc400000001

import java.util.Arrays;

public class SpinWords {
	public String spinWords(String sentence) {
		String out = null;
		String[] words = sentence.split(" ");
		
		for (int i = 0; i < words.length; i++) {
			words[i] = words[i].length() >= 5 ? words[i] = new StringBuilder(words[i]).reverse().toString() : words[i];
		}
		out = Arrays.toString(words); 
		return out.substring(1, out.length()-1).replaceAll(",", "");
	}
} 