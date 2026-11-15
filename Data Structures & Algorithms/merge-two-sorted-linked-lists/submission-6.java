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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        while (list1 != null && list2 != null) {
            

            if (list1.val < list2.val) {
                ListNode temp = list1.next;
                curr.next = list1;
                list1 = temp;
                curr = curr.next;
            } else {
                ListNode temp = list2.next;
                curr.next = list2;
                list2 = temp;
                curr = curr.next;
                }
        }

        if (list1 == null) {
            curr.next = list2;
        }
        if (list2 == null) {
            curr.next = list1;
        }

    return dummy.next;

    }
}