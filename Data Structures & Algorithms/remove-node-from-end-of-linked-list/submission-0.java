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
        ListNode slow = head;
        ListNode fast = slow;

        int count = n;

        while (count > 0) {
            fast = fast.next;
            count--;
        }

        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        if (slow == head) {
            head = head.next;
            slow.next = null;
            return head;
        }

         ListNode current = head;

        while (current.next != slow) {
            current = current.next;
        }

        current.next = slow.next;
        slow.next = null;

        return head;
    }
}
