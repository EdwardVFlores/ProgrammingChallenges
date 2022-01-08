class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode ans = null;
        while(head != null){
            ListNode next = head.next;
            head.next = ans;
            ans = head;
            head = next;
        }
        return ans;
    }
    
}