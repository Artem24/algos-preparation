package org.algos.linkedlist;

public class DeleteTheMiddleNode {

    // 1 -> 2 -> null
    // ^
    //      ^


    // 1 -> 2 -> 3 -> 4 -> null
    //      ^
    //                       ^

   // 1 -> 2 -> 3 -> 4 -> 5 -> null
   // ^
   //           ^

    // 1 -> 2 -> 3 -> 4 -> 5-> null
    //      ^
    //                     ^

    public ListNode deleteMiddle(ListNode head) {
        if (head.next == null) {
            return null;
        }

        ListNode first = head;
        ListNode second = head.next.next;

        while (second != null && second.next != null) {
            first = first.next;
            second = second.next.next;
        }
        first.next = first.next.next;

        return head;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        public static ListNode of(int[] values) {
            if (values == null || values.length == 0) {
                throw new IllegalArgumentException();
            }

            ListNode head = new ListNode(values[0]);
            ListNode cur = head;
            for (int i = 1; i < values.length; i++) {
                cur.next = new ListNode(values[i]);
                cur = cur.next;
            }

            return head;
        }
    }
}
