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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int length1 = getLength(l1);
        int length2 = getLength(l2);
        int carry = 0;
        ListNode dummy = new ListNode(-1);
        ListNode cur = dummy;
        ListNode t1 = l1, t2 = l2;
        while(t1 != null && t2 != null) {
            int curSum = t1.val + t2.val + carry;
            cur.next = new ListNode(curSum % 10);
            carry = curSum/10;
            cur = cur.next;
            t1 = t1.next;
            t2 = t2.next;
        }
        
        while(t1 != null) {
            int curSum = t1.val + carry;
            // System.out.println(curSum%10);
            cur.next = new ListNode(curSum%10);
            cur = cur.next;
            carry = curSum/10;
            t1 = t1.next;
        }
        
        while(t2 != null) {
            int curSum = t2.val + carry;
            cur.next = new ListNode(curSum%10);
            cur = cur.next;
            carry = curSum/10;
            t2 = t2.next;
        }
        System.out.println(carry);
        if(carry == 1) cur.next = new ListNode(1);
        
        return dummy.next;
    }
    
    private int getLength(ListNode l) {
        if(l == null) return 0;
        return 1 + getLength(l.next);
    }
}
