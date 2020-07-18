/*

Given a string, find the length of the longest substring which has no repeating characters.

Example 1:

Input: String="aabccbb"
Output: 3
Explanation: The longest substring without any repeating characters is "abc".
Example 2:

Input: String="abbbb"
Output: 2
Explanation: The longest substring without any repeating characters is "ab".
Example 3:

Input: String="abccde"
Output: 3
Explanation: Longest substrings without any repeating characters are "abc" & "cde".


*/

class Solution {
  public int findLength(String str) {
    Set<Character> set = new HashSet<>();
    int windowStart = 0, maxLen = 0;
    for(int windowEnd = 0; windowEnd < str.length(); windowEnd++) {
      while(set.contains(str.charAt(windowEnd))) {
        maxLen = Math.max(maxLen, windowEnd - windowStart);
        set.remove(str.charAt(windowStart));
        windowStart++;
      }
      set.add(str.charAt(windowEnd));
    }
    return maxLen;
  }
}
