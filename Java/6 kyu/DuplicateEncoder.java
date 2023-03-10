// https://www.codewars.com/kata/54b42f9314d9229fd6000d9c

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DuplicateEncoder {
	static String encode(String word){
		String newWord = "";
		List <String> listOfChars = new ArrayList <String>();
		
		for (int i = 0; i < word.length(); i++) {
			listOfChars.add(Character.toString(word.charAt(i)).toLowerCase());
		}
		
		int occurances = 0;
		for (int i = 0; i < word.length(); i++) {
			occurances = Collections.frequency(listOfChars, Character.toString(word.charAt(i)).toLowerCase());
			if (occurances > 1) {
				newWord += ")";
			} else {
				newWord += "(";
			}
		}
		
		return newWord;
	}
}