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
 
 // Recursive
 
class Solution {
  public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    ListNode dummyHead = new ListNode(-1);
    ListNode cur = dummyHead;
    merge(l1, l2, cur);
    return cur.next;
  }
  
  private void merge(ListNode l1, ListNode l2, ListNode cur) {
    if(l1 == null && l2 == null) return;
    else if(l1 == null) {
      cur.next = l2;
      return;
    }
    else if(l2 == null) {
      cur.next = l1;
      return;
    }
    
    if(l1.val < l2.val) {
      ListNode temp = l1.next;
      l1.next = null;
      cur.next = l1;
      cur = cur.next;
      merge(temp, l2, cur);
    } else if(l1.val > l2.val) {
      ListNode temp = l2.next;
      l2.next = null;
      cur.next = l2;
      cur = cur.next;
      merge(l1, temp, cur);
    } else {
      ListNode temp1 = l1.next;
      l1.next = null;
      cur.next = l1;
      cur = cur.next;
      ListNode temp2 = l2.next;
      l2.next = null;
      cur.next = l2;
      cur = cur.next;
      merge(temp1, temp2, cur);
    }
  }
}
