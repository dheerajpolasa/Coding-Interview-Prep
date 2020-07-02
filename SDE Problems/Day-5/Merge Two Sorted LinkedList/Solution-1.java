/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
// Iterative
class Solution {
  public ListNode mergeLists(ListNode head1, ListNode head2) {
    ListNode dummyHead = new ListNode(-1);
    ListNode cur = dummyHead;
    ListNode curNodeOfHead1 = head1, curNodeOfHead2 = head2;
    while(curNodeOfHead1 != null && curNodeOfHead2 != null) {
      if(curNodeOfHead1.val < curNodeOfHead2.val) {
        cur.next = new ListNode(curNodeOfHead1.val);
        curNodeOfHead1 = curNodeOfHead1.next;
        cur = cur.next;
      } else if(curNodeOfHead1.val > curNodeOfHead2.val) {
        cur.next = new ListNode(curNodeOfHead2.val);
        curNodeOfHead2 = curNodeOfHead2.next;
        cur = cur.next;
      } else {
        cur.next = new ListNode(curNodeOfHead1.val);
        curNodeOfHead1 = curNodeOfHead1.next;
        cur = cur.next;
        cur.next = new ListNode(curNodeOfHead2.val);
        curNodeOfHead2 = curNodeOfHead2.next;
        cur = cur.next;
      }
    }
    
    while(curNodeOfHead1 != null) {
      cur.next = new ListNode(curNodeOfHead1.val);
      cur = cur.next;
      curNodeOfHead1 = curNodeOfHead1.next;
    }
    
    while(curNodeOfHead2 != null) {
      cur.next = new ListNode(curNodeOfHead2.val);
      cur = cur.next;
      curNodeOfHead2 = curNodeOfHead2.next;
    }
    
    return dummyHead.next;
  }
  
}
