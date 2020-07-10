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
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(-1, head);
        ListNode prev = dummy, cur = head;
        while(cur != null) {
            if(cur.next != null && cur.next.val == cur.val) {
                ListNode next = getNext(cur);
                prev.next = next;
                cur = next;
            } else {
                prev = cur;
                cur = cur.next;
            }
        }
        return dummy.next;
    }
    
    private ListNode getNext(ListNode head) {
        while(head.next != null && head.next.val == head.val) {
            head = head.next;
        }
        return head.next;
    }
}
