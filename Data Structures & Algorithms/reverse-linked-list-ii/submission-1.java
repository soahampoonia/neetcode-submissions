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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(0);
dummy.next = head;
        
        ListNode prev = dummy;


        ListNode push = dummy;
        int index = 1;
        
        while (index + 1 <= left) {
            push = push.next;
            index++;
        }

        ListNode before = push;

        push = push.next;

        ListNode start = push;
        
        while (index <= right) {
            ListNode next = push.next;

            push.next = prev;
            prev = push;

            push = next;
            index++;
        }

        ListNode connector = start;

        before.next = prev;
        start.next = push;

        return dummy.next;
    }
}