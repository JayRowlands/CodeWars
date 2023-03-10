// https://www.codewars.com/kata/550554fd08b86f84fe000a58

import java.util.ArrayList;
import java.util.Collections;

public class WhichAreIn { 

	public static String[] inArray(String[] array1, String[] array2) {

		ArrayList<String> toReturn = new ArrayList<String>();
		for (String a : array1) {
			for (String b : array2 ) {
				if (b.contains(a) && !toReturn.contains(a)) {
					toReturn.add(a);
				}
			}
		}
		
		Collections.sort(toReturn);
		String[] arr = toReturn.toArray(new String[toReturn.size()]);
		return arr;
	}
}