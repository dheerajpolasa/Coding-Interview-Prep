import java.util.*;

class Solution {
  public static void main(String[] args) {
    int[] arr = {1, 0, 2, 2, 0, 1, 2};
    sortArray(arr);
    for(int i=0; i<arr.length; i++) {
      System.out.println(arr[i] + " ");
    }
  }
  
  private static void sortArray(int[] arr) {
    int leftSwapIndex = 0;
    int rightSwapIndex = arr.length - 1;
    
    int i = 0;
    while(i < arr.length) {
      if(arr[i] == 0) {
        swap(arr, i, leftSwapIndex);
        i++;
        leftSwapIndex++;
      } else if(arr[i] == 1) {
        i++;
      } else {
        swap(arr, i, rightSwapIndex);
        rightSwapIndex--;
      }
    }
  }
  
  private void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
}
