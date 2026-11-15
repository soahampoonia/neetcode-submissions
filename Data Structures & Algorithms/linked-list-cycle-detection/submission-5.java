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
    public boolean hasCycle(ListNode head) {
        
        if (head == null) return false;
        
        ListNode slow = head;
        ListNode fast = head.next;

        

        while (fast != null) {
            if (slow == fast) {
                return true;
            }
            if (fast.next == null || fast.next.next == null) {
                return false;
            } 
            fast = fast.next.next;
            slow = slow.next;
        }
        return false;
    }
}
