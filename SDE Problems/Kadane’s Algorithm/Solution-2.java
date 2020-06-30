import java.util.*;

class Solution {
  public static void main(String[] args) {
    int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
    int maxSum = getMaxSubArraySum(arr);
    System.out.println(maxSum);
  }
  
  private static int getMaxSubArraySum(int[] arr) {
    int res = Integer.MIN_VALUE, sum = 0;
    for(int val: arr) {
      sum += val;
      res = Math.max(res, sum);
      sum = (sum < 0) ? 0 : sum;
    }
    
    return res;
  }
  
}
