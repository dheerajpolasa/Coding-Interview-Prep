/*

Problem 1: Longest Substring with at most 2 distinct characters

Given a string, find the length of the longest substring in it with at most two distinct characters.

*/

class Solution {
  public int findMaxLen(String str) {
    Set<Character> set = new HashSet<>();
    int windowStart = 0, maxLen = 0;
    for(int windowEnd = 0; windowEnd < str.length(); windowEnd++) {
      set.add(str.charAt(windowEnd));
      while(set.size() > 2) {
        set.remove(str.charAt(windowStart));
        windowStart++;;
      }
      maxLen = Math.max(maxLen, windowEnd - windowStart + 1);
    }
    return maxLen;
  }
}
