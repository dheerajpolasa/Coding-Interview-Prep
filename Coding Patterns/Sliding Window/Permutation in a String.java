/*

Given a string and a pattern, find out if the string contains any permutation of the pattern.

Permutation is defined as the re-arranging of the characters of the string. For example, “abc” has the following six permutations:

abc
acb
bac
bca
cab
cba
If a string has ‘n’ distinct characters it will have n!n! permutations.

Example 1:

Input: String="oidbcaf", Pattern="abc"
Output: true
Explanation: The string contains "bca" which is a permutation of the given pattern.
Example 2:

Input: String="odicf", Pattern="dc"
Output: false
Explanation: No permutation of the pattern is present in the given string as a substring.
Example 3:

Input: String="bcdxabcdy", Pattern="bcdyabcdx"
Output: true
Explanation: Both the string and the pattern are a permutation of each other.
Example 4:

Input: String="aaacb", Pattern="abc"
Output: true
Explanation: The string contains "acb" which is a permutation of the given pattern.


https://leetcode.com/problems/permutation-in-string/


*/




class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for(char chr: s1.toCharArray()) {
            hm.put(chr, hm.getOrDefault(chr, 0) +  1);
        }
        int windowStart = 0, matched = 0;
        for(int windowEnd = 0; windowEnd < s2.length(); windowEnd++) {
            char rightChar = s2.charAt(windowEnd);
            if(hm.containsKey(rightChar)) {
                hm.put(rightChar, hm.get(rightChar) - 1);
                if(hm.get(rightChar) == 0) {
                    matched++;
                }
            }
            
            if(matched == hm.size()) {
                return true;
            }
            
            if(windowEnd >= s1.length() - 1) {
                char leftChar = s2.charAt(windowStart);
                if(hm.containsKey(leftChar)) {
                    if(hm.get(leftChar) == 0)
                        matched--;
                    hm.put(leftChar, hm.get(leftChar) + 1);
                }
                windowStart++;
            }
        }
        return false;
    }
}
