  /*

Given a string with lowercase letters only, if you are allowed to replace no more than ‘k’ letters with any letter, find the length of the longest substring having the same letters after replacement.

Example 1:

Input: String="aabccbb", k=2
Output: 5
Explanation: Replace the two 'c' with 'b' to have a longest repeating substring "bbbbb".
Example 2:

Input: String="abbcb", k=1
Output: 4
Explanation: Replace the 'c' with 'b' to have a longest repeating substring "bbbb".
Example 3:

Input: String="abccde", k=1
Output: 3
Explanation: Replace the 'b' or 'd' with 'c' to have the longest repeating substring "ccc".


*/

class Solution {
  public inf findLength(String str) {
    HashMap<Character, Integer> hm = new HashMap<>();
    int windowEnd = 0, maxLen = 0, maxRepeated = 0;
    for(int windowStart = 0; windowStart < str.length(); windowStart++) {
      hm.put(str.charAt(windowStart), hm.getOrDefault(str.charAt(windowStart), 0) + 1);
      maxRepeated = Math.max(maxRepeated, hm.get(str.charAt(windowEnd));
      if(windowEnd - windowStart + 1 - maxRepeated > k) {
        hm.put(str.charAt(windowStart), hm.get(str.charAt(windowEnd) - 1);
        windowStart++;
      }
      maxLen = Math.max(maxLen, windowEnd - windowStart + 1);
    }
    return maxLen;
  }
}
