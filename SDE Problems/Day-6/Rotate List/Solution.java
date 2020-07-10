/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null) return head;
        int length = 1;
        ListNode temp = head;
        while(temp.next != null) {
            length++;
            temp = temp.next;
        }
        k %= length;
        temp.next = head;
        int skipLength = length - k;
        ListNode lastNodeOfFirstPart = head;
        while(skipLength-- > 1) {
            lastNodeOfFirstPart = lastNodeOfFirstPart.next;
        }
        head = lastNodeOfFirstPart.next;
        lastNodeOfFirstPart.next = null;
        return head;
    }
    
    
}
