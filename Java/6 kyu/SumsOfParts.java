// https://www.codewars.com/kata/5ce399e0047a45001c853c2b

class SumParts {

    public static int[] sumParts(int[] ls) {
            
            int[] sumArray = new int[ls.length+1];
            int sum = 0;
            
            for (int num : ls) {
                sum += num;
            }
            
            for (int i = 0; i < ls.length; i++) {
                sumArray[i] = sum;
                sum -= ls[i];
            }
    
            sumArray[sumArray.length-1] = 0;
            return sumArray;
    
        }
      }