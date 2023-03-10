// https://www.codewars.com/kata/5412509bd436bd33920011bc

public class Maskify {
    public static String maskify(String str) {
        if (str.length() < 4) {
          return str;
        } else {
        	String newStr = "";
        	for (int i = 0; i < str.length(); i++) {
        		if (i < str.length()-4) {
        			newStr += '#';
        		} else {
        			newStr += str.charAt(i);
        		}
              }
          return newStr;
        }
    }
}