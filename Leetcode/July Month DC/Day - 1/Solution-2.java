import java.util.*;

class Solution {
  public static void main(String[] args) {
    int n = 5;
    System.out.println(getTotalStairCaseRows(n));
  }
  
  private static int getTotalStairCaseRows(int n) {
    long low = 1, high = n, res = 0;
    while(low < high) {
      long mid = low + (high - low)/2;
      long sum = getSum(mid);
      if(sum == n) return (int) mid;
      if(sum > n) {
        high = mid - 1;
      } else {
        low = mid + 1;
        res = mid;
      }
    }
    
    return (int) res;
  }
  
}
