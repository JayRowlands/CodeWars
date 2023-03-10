// https://www.codewars.com/kata/5663f5305102699bad000056

class MaxDiffLength {

	public static int mxdiflg(String[] a1, String[] a2) {
		int max = -1;
		int diff = 0;
	
		if (a1.length == 0 || a2.length == 0) {
			return -1;
		} else {
			for (int i = 0; i < a1.length; i++) {
				for (int j = 0; j < a2.length; j++) {
					diff = Math.abs(a1[i].length() - a2[j].length());
					max = Math.max(max, diff);
				}
			}
		}
		return max;
	}
}