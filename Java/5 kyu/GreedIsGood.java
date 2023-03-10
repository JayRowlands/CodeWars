// https://www.codewars.com/kata/5270d0d18625160ada0000e4

public class Greed{
    public static int greedy(int[] dice){
          int[] nums = new int[7];
          int score = 0;
          
          for (int num : dice) {
              nums[num]++;
          }
          
          if (nums[1] >= 3) {
              score += 1000;
              nums[1] = nums[1]-3;
          } else if (nums[2] >= 3) {
              score += 200;
              nums[2] = nums[2]-3;
          } else if (nums[3] >= 3) {
              score += 300;
              nums[3] = nums[3]-3;
          } else if (nums[4] >= 3) {
              score += 400;
              nums[4] = nums[4]-3;
          } else if (nums[5] >= 3) {
              score += 500;
              nums[5] = nums[5]-3;
          } else if (nums[6] >= 3) {
              score += 600;
              nums[6] = nums[6]-3;
          }
          
          
          while (nums[1] != 0 || nums[5] != 0) {
              if (nums[1] > 0) {
                  score += 100;
                  nums[1]--;
              }
              if (nums[5] > 0) {
                  score += 50;
                  nums[5]--;
              }
          }
          return score;
      }
  }