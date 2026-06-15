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
    public ListNode deleteMiddle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }

        // 1 traversal
        ListNode s = head, f = head.next.next;
        while (f != null && f.next != null) {
            s = s.next;
            f = f.next.next;
        }
        s.next = s.next.next;
        return head;

        // 1.5 traversal
        // int s = 0;
        // ListNode temp = head;
        // while (temp != null) {
        //     s++;
        //     temp = temp.next;
        // }
        // int mid = s / 2;
        // temp = head;
        // for (int i = 0; i < mid - 1; i++) {
        //     temp = temp.next;
        // }
        // temp.next = temp.next.next;
        // return head;
    }
}