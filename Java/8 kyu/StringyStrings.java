// https://www.codewars.com/kata/563b74ddd19a3ad462000054

public class Kata {
    public static String stringy(int size) {
      String stringy = "";
      for (int i = 0; i < size; i++) {
        if (i % 2 == 0) {
           stringy+= "1";
        } else {
          stringy += "0";
        }
      }
      return stringy;
    }
  }