import java.util.*;

class Solution {
  public static void main(String[] args) {
    int[] arr = {1, 3, 4, 2, 2};
    int duplicateNumber = findDuplicateNumber(arr);
    System.out.println(duplicateNumber);
  }
  
  private static int findDuplicateNumber(int[] arr) {
    int slow = arr[0];
    int fast = arr[0];
    
    do {
      slow = arr[slow];
      fast = arr[arr[fast]];
    } while(slow != fast);
    
    slow = arr[0];
    while(slow != fast) {
      slow = arr[slow];
      fast = arr[fast];
    }
    return slow;
  }
}
