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
    ListNode newHead;
    public ListNode reverseList(ListNode head) {
        if(head == null) return null;
        ListNode prev = reverse(head);
        prev.next = null;
        return newHead;
    }
    
    private ListNode reverse(ListNode head) {
        if(head.next == null) {
            newHead = head;
            ListNode prev = head;
            return prev;
        }
        ListNode prev = reverse(head.next);
        prev.next = head;
        prev = prev.next;
        return prev;
    }
}
