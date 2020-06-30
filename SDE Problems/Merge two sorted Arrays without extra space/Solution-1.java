import java.util.*;

class Solution {
  public static void main(String[] args) {
    int[] arr1 = {1, 34, 44, 90};
    int[] arr2 = {2, 23, 432, 1999};
    int[] arr3 = getMergedArray(arr1, arr2);
    for(int i=0; i<arr3.length; i++) {
      System.out.print(arr3[i] + " ");
    }
    
  }
  
  private static int[] getMergedArray(int[] arr1, int[] arr2) {
    int n = arr1.length + arr2.length;
    int[] res = new int[n];
    int idx = 0;
    for(int i=0; i<arr1.length; i++) {
      res[idx++] = arr1[i];
    }
    for(int i=0; i<arr2.length; i++) {
      res[idx++] = arr2[i];
    }
    
    Arrays.sort(res);
    return res;
  }
  
}
