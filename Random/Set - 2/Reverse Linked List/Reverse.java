public class Solution{
    public static Node reverse(Node head, int k)
    {
        //Your code here
        //Make change in the linked list only
        //Return the head of the new Linked list
        Node prevHead = null, newHead = head, lastHead = head;
        while(true) {
            Node curHead = newHead, prev = lastHead, next;
            for(int i=0; i<k && curHead != null; i++) {
                next = curHead.next;
                curHead.next = prev;
                prev = curHead;
                curHead = next;
            }
            if(prevHead == null) {
                prevHead = prev;
            } else {
                lastHead.next = prev;
            }
            lastHead = newHead;
            newHead = curHead;
            if(curHead == null) {
                break;
            }
        }
        return prevHead;
     }
}
