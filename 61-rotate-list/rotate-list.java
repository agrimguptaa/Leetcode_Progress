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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }
        ListNode curr = head;
        int len = 1;
        while (curr.next != null) {
            curr = curr.next;
            len++;
        }
        ListNode last = curr; 
        ListNode oldHead = head;
        k = k % len;
        if (k == 0) {
            return head;
        }
        k = len - k - 1;
        ListNode tail = head;
        for (int i = 0; i < k; i++) {
            tail = tail.next;
        }
        head = tail.next;
        tail.next = null;
        last.next = oldHead;
        return head;
    }
}