// https://www.codewars.com/kata/622de76d28bf330057cd6af8

public class HowManyPagesInABook {
	public static int amountOfPages(int summary) {

		int nums = 0;
		int count = 0;
		
		while (nums < summary) {
			count++;
			nums += String.valueOf(count).length();
		}
		
		return count;
	}
}