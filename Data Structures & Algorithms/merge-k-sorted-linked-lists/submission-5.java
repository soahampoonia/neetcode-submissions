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
    public ListNode mergeKLists(ListNode[] lists) {
        
        PriorityQueue<ListNode> minHeap = new PriorityQueue<>((a, b) -> Integer.compare(a.val, b.val));

        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        for (int i = 0; i < lists.length; i++) {
            
            if (lists[i] != null) {
                minHeap.offer(lists[i]);
            }
        
        }

        while (!minHeap.isEmpty()) {
           ListNode smallest = minHeap.poll();
           curr.next = smallest;
           curr = curr.next; 
            

            if (smallest.next != null) {
                minHeap.offer(smallest.next);
            }
        }

        return dummy.next;


    }
}
