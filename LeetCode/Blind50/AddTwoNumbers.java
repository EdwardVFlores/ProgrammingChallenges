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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode answer = new ListNode(0);
        ListNode head = answer;
        int carry = 0;
        while(l1 != null && l2 != null) { // add nodes when there is a l1 and l2 node together
            int sum = carry + l1.val + l2.val;
            carry = sum / 10;
            ListNode rem = new ListNode(sum % 10);
            answer.next = rem;
            answer = answer.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        while(l1 != null || l2 != null) { // add the rest of the non null nodes
            int sum = carry + ((l1 == null) ? l2.val : l1.val);
            carry = sum / 10;
            ListNode rem = new ListNode(sum % 10);
            answer.next = rem;
            answer = answer.next;
            if(l1 == null) l2 = l2.next;
            else l1 = l1.next;
        }
        if(carry != 0) answer.next = new ListNode(1); // carry 1 at the end

        return head.next;
    }
}