import java.util.*;

class Solution {
  public static void main(String[] args) {
    int[] arr = {0, 1, 2, 0, 2, 1};
    Arrays.sort(arr);
    for(int i=0; i<arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }
 }
