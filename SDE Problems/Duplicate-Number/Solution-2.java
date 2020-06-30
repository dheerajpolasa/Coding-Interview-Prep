import java.util.*;
class Solution {
  public static void main(String[] args) {
    int arr = {1, 3, 4, 2, 2};
    int duplicateNumber = findDuplicateNumber(arr);
    System.out.println(duplicateNumber);
  }
  
  private static int findDuplicateNumber(int[] arr) {
    Arrays.sort(arr);
    for(int i=1; i<arr.length; i++) {
      if(arr[i] == arr[i-1]) {
        return arr[i];
      }
    }
    
    return -1;
  }
  
}
