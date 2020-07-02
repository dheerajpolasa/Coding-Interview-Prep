class Solution {
  public ListNode middleNode(ListNode head) {
    int len = getLength(head);
    int mid = len / 2;
    ListNode cur = head;
    int i = 0;
    while(i <= mid) {
      cur = cur.next;
      i++;
    }
    
    return cur;
    
  }
  
  private int getLength(ListNode head) {
    int len = 0;
    ListNode cur = head;
    while(cur != null) {
      len++;
      cur = cur.next;
    }
    return len;
  }
}
      
