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
        ListNode temp = head, prev = null;
        while(temp != null) {
            ListNode temp2 = temp;
            while(temp2.next != null && temp2.val == temp2.next.val) {
                temp2 = temp2.next;
            }
            if(temp != temp2) {
                System.out.println(temp2.val);
                if(prev != null)
                    prev.next = temp2.next;
                else
                    head = temp2.next;
                temp = temp2.next;
            } else {
                prev = temp;
                temp = temp.next;   
            }
        }
        return head;
    }
}
