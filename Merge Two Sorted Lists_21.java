/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head, pre;
        if(l1 == null)return l2;
        if(l2 == null)return l1;
        if(l1.val < l2.val)
        {
            head = l1;
            l1 = l1.next;
        }
        else
        {
            head = l2;
            l2 = l2.next;
        }
        pre = head;
        while(l1 != null && l2 != null)
        {
            if(l1.val < l2.val)
            {
                pre.next = l1;
                pre = pre.next;
                l1 = l1.next;
            }
            else
            {
                pre.next = l2;
                pre = pre.next;
                l2 = l2.next;
            }
        }
        if(l1 != null)
        {
            pre.next = l1;
        }
        else
        pre.next = l2;
        return head;
    }
}
