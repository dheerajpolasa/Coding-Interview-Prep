/*

Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

Example:

Input: [-2,1,-3,4,-1,2,1,-5,4],
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.
Follow up:

If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.



*/

class Solution {
    public int maxSubArray(int[] nums) {
        int res = Integer.MIN_VALUE;
        int cur = 0;
        for(int num: nums) {
            cur += num;
            res = Math.max(cur, res);
            if(cur < 0) {
                cur = 0;
            }
        }
        return res;
    }
}
