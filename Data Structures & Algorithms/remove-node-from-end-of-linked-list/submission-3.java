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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);

        dummy.next = head;
        
        ListNode slow = dummy;
        ListNode fast = dummy;

        ListNode prev = null;

        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }

        while (fast != null) {
            if (fast.next == null) {
                prev = slow;
                break;
            }
            fast = fast.next;
            slow = slow.next;
        }

        if (prev != null && prev.next != null) {
            prev.next = prev.next.next;
        }

        return dummy.next;
    }
}
