/*

Given an array of positive numbers and a positive number ‘k’, find the maximum sum of any contiguous subarray of size ‘k’.

Example 1:

Input: [2, 1, 5, 1, 3, 2], k=3 
Output: 9
Explanation: Subarray with maximum sum is [5, 1, 3].

*/

class Solution {
  public int findMaxSubArray(int k, int[] arr) {
    int windowStart = 0, windowSum = 0;
    int maxSum = 0;
    for(int i=0; i<arr.length; i++) {
      windowSum += arr[i];
      if(windowEnd >= k-1) {
        maxSum = Math.max(maxSum, windowSum);
        windowSum -= arr[windowStart];
        windowStart++;
      }
    }
    return maxSum;
  }
  
}
