import java.util.*;

class Solution {
  public static void main(String[] args) {
    int[] arr = {1, 3, 4, 2, 2};
    int duplicateNumber = findDuplicateNumber(arr);
    System.out.println(duplicateNumber);
  }
  
  private static int findDuplicateNumber(int[] arr) {
    for(int i=0; i<arr.length; i++) {
      for(int j=i+1; j<arr.lenght; j++) {
        if(arr[i] == arr[j]) {
          return arr[i];
        }
      }
    }
    
    return -1;
  }
  
}
