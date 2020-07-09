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
        HashMap<Integer, ListNode> hm = new HashMap<>();
        int sum = 0;
        ListNode temp = head;
        System.out.print("[");
        while(temp != null) {
            
            System.out.print(sum + ",");
            // if(sum == 0) {
            //     head = temp.next;
            // }
            if(hm.containsKey(sum)) {
                // System.out.println(sum);
                
                ListNode prev = getPrev(head, hm.get(sum));
                // System.out.println(prev == null ? -99 : prev.val);
                if(head == hm.get(sum)) {
                    head = temp;
                } else if(prev != null) {
                    prev.next = temp;   
                }
                // prev.next = temp;
                hm.put(sum, temp);
            } else {
                hm.put(sum, temp);
            }
            sum += temp.val;
            temp = temp.next;
        }
        
        if(hm.containsKey(sum)) {
                // System.out.println(sum);
                
                ListNode prev = getPrev(head, hm.get(sum));
                // System.out.println(prev == null ? -99 : prev.val);
                if(head == hm.get(sum)) {
                    head = temp;
                } else if(prev != null) {
                    prev.next = temp;   
                }
                // prev.next = temp;
                hm.put(sum, temp);
            }
        
        return head;
    }
    
    private void print(ListNode head) {
        if(head == null) {
            return;
        }
        System.out.print(head.val + ",");
        print(head.next);
    }
    
    private ListNode getPrev(ListNode head, ListNode node) {
        // System.out.print("[");
        // print(head);
        ListNode prev = null, cur = head;
        while(cur != null && cur.next != node) {
            cur = cur.next;
        }
        return cur;
    }
}
