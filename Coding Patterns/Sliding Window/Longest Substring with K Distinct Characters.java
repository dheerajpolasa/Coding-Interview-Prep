/*

Given a string, find the length of the longest substring in it with no more than K distinct characters.

Example 1:

Input: String="araaci", K=2
Output: 4
Explanation: The longest substring with no more than '2' distinct characters is "araa".
Example 2:

Input: String="araaci", K=1
Output: 2
Explanation: The longest substring with no more than '1' distinct characters is "aa".
Example 3:

Input: String="cbbebi", K=3
Output: 5
Explanation: The longest substrings with no more than '3' distinct characters are "cbbeb" & "bbebi".

*/

class Solution {
  public int findLength(String str, int k) {
    Set<Character> set = new Hashset<>();
    int windowStart = 0, maxLen = 0;
    for(int windowEnd = 0; windowEnd < str.length(); windowEnd++) {
      set.add(str.charAt(windowEnd));
      while(set.size() > k) {
        set.remove(str.charAt(windowStart));
        windowStart++;
      }
      maxLen = Math.max(maxLen, windowEnd - windowStart + 1);
    }
    return maxLen;
  }
}
