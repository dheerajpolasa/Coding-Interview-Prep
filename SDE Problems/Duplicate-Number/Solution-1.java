import java.util.*;
class Solution {
  public static void main(String[] args) {
    int[] arr = {1, 3, 4, 2, 2};
    int duplicateNumber = findDuplicateNumber(arr);
  }
  
  private static int findDuplicateNumber(int[] arr) {
    Set<Integer> set = new HashSet<>();
    for(int val: arr) {
      if(set.contains(val)) {
        return val;
      }
      set.add(val);
    }
    
    return -1;
  }
  
}
