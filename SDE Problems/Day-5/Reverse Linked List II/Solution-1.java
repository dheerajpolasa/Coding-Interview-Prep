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
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode mCur = head, mParent = null, nCur = head, nChild = null;
        int i = 1;
        while(i < m) {
            mParent = mCur;
            mCur = mCur.next;
            i++;
        }
        i = 1;
        while(i < n) {
            nCur = nCur.next;
            i++;
        }
        
        nChild = nCur.next;
        nCur.next = null;
        ListNode newHead = reverse(mCur);
        ListNode lastNode = find(newHead);
        if(mParent != null) {
            mParent.next = newHead;                    
        } else {
            head = newHead;
        }
        lastNode.next = nChild;
        
        return head;
    }
    
    private ListNode find(ListNode head) {
        if(head == null || head.next == null) return head;
        return find(head.next);
    }
    
    private ListNode reverse(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode p = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return p;
    }
}
