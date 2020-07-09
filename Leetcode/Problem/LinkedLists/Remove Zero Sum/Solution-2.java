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
    public ListNode removeZeroSumSublists(ListNode head) {
        ListNode dummyHead = new ListNode(0, head);
        HashMap<Integer, ListNode> hm = new HashMap<>();
        hm.put(0, dummyHead);
        int sum = 0;
        for(ListNode temp = head; temp != null; temp = temp.next) {
            sum += temp.val;
            hm.put(sum, temp);
        }
        sum = 0;
        head = dummyHead;
        while(head != null) {
            sum += head.val;
            ListNode last = hm.get(sum);
            if(last != head) {
                head.next = last.next;
            }
            head = head.next;
        }
        return dummyHead.next;
    }
}
