// https://www.codewars.com/kata/520b9d2ad5c005041100000f

public class PigLatin {
  public static String pigIt(String str) {
		String toReturn = "";
		String regex = "[a-zA-Z]+";
		for (String s : str.split(" ")) {
			if (s.matches(regex)) {
				if (toReturn == "" ) {
					if (!s.isBlank()) {
						toReturn += s.substring(1,s.length()) + s.charAt(0) + "ay";
					}

				} else {
					if (!s.isBlank()) {
						toReturn += " " + s.substring(1,s.length()) + s.charAt(0) + "ay";
					} 
				}
			} else {
				toReturn += " " + s;
			}
		}

		return toReturn;
	}
}