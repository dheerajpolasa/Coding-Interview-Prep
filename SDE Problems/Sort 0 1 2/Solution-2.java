import java.util.*;

class Solution {
  public static void main(String[] args) {
    int[] arr = {0, 1, 2, 2, 1, 0};
    sortArray(arr);
    for(int i=0; i<arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }
  
  private static void sortArray(int[] arr) {
    int oneCount = 0;
    int twoCount = 0;
    for(int i=0; i<arr.length; i++) {
      if(arr[i] == 1) oneCount++;
      else if(arr[i] == 2) twoCount++;
    }
    
    int zeroCount = arr.length - (oneCount + twoCount);
    int idx = 0;
    for(int i=0; i<zeroCount; i++) {
      arr[idx++] = 0;
    }
    
    for(int i=0; i<oneCount; i++) {
      arr[idx++] = 1;
    }
    
    for(int i=0; i<twoCount; i++) {
      arr[idx++] = 2;
    }
  }
 }
 
