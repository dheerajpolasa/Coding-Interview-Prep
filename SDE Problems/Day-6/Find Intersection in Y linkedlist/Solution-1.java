/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lengthA = getLength(headA);
        int lengthB = getLength(headB);
        
        ListNode tempA = headA, tempB = headB;
        if(lengthA > lengthB) {
            int move = lengthA - lengthB;
            while(move-- > 0) {
                tempA = tempA.next;
            }
        } else {
            int move = lengthB - lengthA;
            while(move-- > 0) {
                tempB = tempB.next;
            }
        }
        
        while(tempA != null && tempB != null) {
            if(tempA == tempB) {
                return tempA;
            }
            tempA = tempA.next;
            tempB = tempB.next;
        }
        
        return null;
    }
    
    public int getLength(ListNode h) {
        if(h == null) return 0;
        return 1 + getLength(h.next);
    }
}
