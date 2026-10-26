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
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) return;

        ArrayList<ListNode> list = new ArrayList<>();

        ListNode current = head;
        while (current != null) {
            list.add(current);
            current = current.next;
        }

        ListNode dummy = new ListNode();
        current = dummy;

        for (int i = 0; i < list.size() / 2; i++) {
            current.next = list.get(i);
            current = current.next;
            current.next = list.get(list.size() - i - 1);
            current = current.next;
        }

        if (list.size() % 2 == 1) {
            current.next = list.get(list.size() / 2);
            current = current.next;
        }
        
        current.next = null;
    }
}
