import java.util.*;

class Solution {
  public static void main(String[] args) {
      int[] arr1 = {1, 4, 7, 9};
      int[] arr2 = {2, 3, 5, 8};
      
      int[] res = getMergedArray(arr1, arr2);
      for(int i=0; i<res.length; i++) {
        System.out.print(res[i] + " ");
      }
  }
  
  private static int[] getMergedArray(int[] arr1, int[] arr2) {
    int n = arr1.length + arr2.length;
    int[] res = new int[n];
    int i = 0, j = 0, k = 0;
    while(i < arr1.length && j < arr2.length) {
      if(arr1[i] < arr2[j]) {
        res[k++] = arr1[i];
        i++;
      } else if(arr1[i] > arr2[j]) {
        res[k++] = arr2[j];
        j++;
      } else {
        res[k++] = arr1[i];
        i++;
        res[k++] = arr2[j];
        j++;
      }
    }
    
    while(i < arr1.length) {
      res[k++] = arr1[i];
    }
    
    while(j < arr2.length) {
      res[k++} = arr2[j];
    }
    
    return res;
  } 
 }
