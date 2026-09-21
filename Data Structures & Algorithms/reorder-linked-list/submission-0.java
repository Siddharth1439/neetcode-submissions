class Solution {
    public void reorderList(ListNode head) {

        if (head == null || head.next == null) return;

        // Find middle
        ListNode slow = head;
        ListNode fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Split
        ListNode second = slow.next;
        slow.next = null;

        // Reverse second half
        ListNode prev = null;

        while (second != null) {
            ListNode next = second.next;
            second.next = prev;
            prev = second;
            second = next;
        }

        // Merge
        ListNode first = head;

        while (prev != null) {
            ListNode temp1 = first.next;
            ListNode temp2 = prev.next;

            first.next = prev;
            prev.next = temp1;

            first = temp1;
            prev = temp2;
        }
    }
}