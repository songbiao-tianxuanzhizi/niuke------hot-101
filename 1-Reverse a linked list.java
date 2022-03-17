/**
 * @author SongBiao
 * @Date 18:47
 */
public class Solution {
    public ListNode ReverseList(ListNode head) {
        if(head == null) {
            return null;
        }
        if(head.next == null) {
            return head;
        }
        ListNode node = head;
        ListNode prev = null;
        while(node != null) {
            ListNode node1 = node.next;
            node.next = prev;
            prev = node;
            node = node1;
        }
        return prev;
    }
}
