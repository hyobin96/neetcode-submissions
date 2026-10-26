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

        HashSet<ListNode> set = new HashSet<>();
        set.add(head);

        ListNode current = head;
        while (current.next != null) {
            current = current.next;
            if (set.contains(current)) return true;
            set.add(current);
        }

        return false;
    }
}
