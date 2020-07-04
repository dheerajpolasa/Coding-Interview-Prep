/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    ListNode start;
    boolean isPalin = true;
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        storeValues(head, list);
        int i = 0, j = list.size();
        while(i < j) {
          if(list.get(i) != list.get(j)) {
            return false;
          }
          i++;
          j--;
        }
        
        return true;
    }
    
    private void storeValues(ListNode head, ArrayList<Integer> list) {
      if(head == null) return;
      list.add(head.val);
      storeValues(head.next, list);
    }
    
 }
