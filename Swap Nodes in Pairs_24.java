/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null)return head;
        ListNode p = head, left, right;
        head = p.next;
        p.next = p.next.next;
        head.next = p;
        while(p.next != null && p.next.next!=null)
        {
            left = p;
            p = p.next;
            right = p.next.next;
            left.next = p.next;
            left.next.next = p;
            p.next = right;
        }
        return head;
    }
}
