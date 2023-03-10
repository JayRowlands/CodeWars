// https://www.codewars.com/kata/5503013e34137eeeaa001648

class Diamond {
	public static String print(int n) {
		if (n < 0 || n % 2 == 0) {
			return null;
		} else {
			int mid = n/2;
			String toReturn = "";
			int upper = mid;
			int lower = mid;

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (j == upper) {
						toReturn+= "*\n";
						break;
					} else if (j == mid || (j >= lower && j <= upper)) { 
						toReturn+= "*";
					} else {
						toReturn += " ";
					}
				}

				if (i >= mid) {
					lower++;
					upper--;
				} else {
					lower--;
					upper++;
				}
			}
			
			return toReturn;
		}
	}
}