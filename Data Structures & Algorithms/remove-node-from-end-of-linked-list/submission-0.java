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
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode fastptr = dummy;
        ListNode slowptr = dummy;
        for(int i=0;i<=n;i++){
            fastptr = fastptr.next;
        }
        while(fastptr != null){
            slowptr = slowptr.next;
            fastptr = fastptr.next;
        }
        slowptr.next = slowptr.next.next;
        return dummy.next;

    }
}
