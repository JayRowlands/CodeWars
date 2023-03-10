// https://www.codewars.com/kata/54edbc7200b811e956000556

public class Counter {
    public int countSheeps(Boolean[] arrayOfSheeps) {
      int i = 0;
      int sheep = 0;
      
      while (i <= (arrayOfSheeps.length) -1) {
        if (arrayOfSheeps[i] == null) {
          i++;
        } else if (arrayOfSheeps[i] == true) {
          sheep++; 
          i++;
        } else {
          i++;
        } 
      }
      
      return sheep;
    }
  }