import java.util.*;

class Solution {
  public static void main(String[] args) {
    int[] arr1 = new int[10] {1, 2, 4, 9, 12};
    int[] arr2 = {3, 5, 8, 10, 11};
    mergeArray(arr1, arr2);
    for(int i=0; i<arr1.length; i++) {
      System.out.print(arr1[i] + " ");
    }
  }
  
  private static void mergeArray(int[] arr1, int m, int[] arr2, int n) {
    int k = arr1.length - 1;
    int i = m, j = n;
    while(i >= 0 && j >= 0) {
      if(arr1[i] > arr2[j]) {
        arr1[k--] = arr1[i];
        i--;
      } else if(arr1[i] < arr2[j]) {
        arr1[k--] = arr2[j];
        j--;
      } else {
        arr[k--] = arr2[i];
        i--;
        arr[k--] = arr2[j];
        j--;
      }
      
      while(i >= 0) {
        arr[k--] = arr1[i--];
      }
      
      while(j >= 0) {
        arr[k--] = arr2[j--];
      }
  }
  
}
