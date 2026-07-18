class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {

        if (head == null || k == 1) {
            return head;
        }


        int length = 0;
        ListNode temp = head;

        while (temp != null) {
            length++;
            temp = temp.next;
        }


        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;

        while (length >= k) {


            ListNode start = prev.next;

            ListNode curr = start.next;

            for (int i = 1; i < k; i++) {

                start.next = curr.next;
                curr.next = prev.next;
                prev.next = curr;

                curr = start.next;
            }

            prev = start;

            length -= k;
        }

        return dummy.next;
    }
}

