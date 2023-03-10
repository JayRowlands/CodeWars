// https://www.codewars.com/kata/52e88b39ffb6ac53a400022e

import java.math.BigInteger;

public class Kata {
	public static String longToIP(long ip) {
		String ipString = "";
		String[] parts = new String[4];
		int count = 0;
		String toReturn = "";
		
		if (Long.toBinaryString(ip).length() != 32) {
			for (int i = 0; i < 32 - Long.toBinaryString(ip).length(); i++) {
				ipString+= "0"; 
			}
			ipString +=Long.toBinaryString(ip);
		} else {
			ipString = Long.toBinaryString(ip);
		}
		
		parts = ipString.split("(?<=\\G.{8})");
		
		BigInteger firstNum = new BigInteger(parts[0], 2);
		BigInteger secondNum = new BigInteger(parts[1], 2);
		BigInteger thirdNum = new BigInteger(parts[2], 2);
		BigInteger fourthNum = new BigInteger(parts[3], 2);
		
		toReturn = firstNum + "." + secondNum + "." + thirdNum + "." + fourthNum;

		return toReturn;
	}
}