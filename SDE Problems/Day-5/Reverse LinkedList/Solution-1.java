import java.util.*;

class Solution {
  private ListNode reverseList(ListNode head) {
    ListNode prev = null, cur = head, next;
    while(cur != null) {
      next = cur.next;
      cur.next = prev;
      prev = cur;
      cur = next;
    }
    return prev;
  }
}
