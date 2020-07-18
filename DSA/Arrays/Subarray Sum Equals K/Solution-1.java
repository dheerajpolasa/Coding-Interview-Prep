class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        for(int i=0; i<nums.length; i++) {
            int curSum = 0;
            for(int j=i; j<nums.length; j++) {
                curSum += nums[j];
                if(curSum == k) count++;
            }
        }
        return count;
    }
}
