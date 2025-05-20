package org.algos.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class DeleteTheMiddleNodeTest {

    private final DeleteTheMiddleNode solution = new DeleteTheMiddleNode();

    @Test
    public void test1() {
        DeleteTheMiddleNode.ListNode head = solution.deleteMiddle(
                new DeleteTheMiddleNode.ListNode(1,
                        new DeleteTheMiddleNode.ListNode(2,
                                new DeleteTheMiddleNode.ListNode(3)))
        );

        assertEquals(1, head.val);
        assertEquals(3, head.next.val);
        assertNull(head.next.next);
    }

    @Test
    public void test2() {
        DeleteTheMiddleNode.ListNode head = DeleteTheMiddleNode.ListNode.of(new int[]{1, 3, 4, 7, 1, 2, 6});
        DeleteTheMiddleNode.ListNode newHead = solution.deleteMiddle(head);

        assertEquals(1, newHead.val);
        assertEquals(3, newHead.next.val);
        assertEquals(4, newHead.next.next.val);
        assertEquals(1, newHead.next.next.next.val);
        assertEquals(2, newHead.next.next.next.next.val);
        assertEquals(6, newHead.next.next.next.next.next.val);
        assertNull(newHead.next.next.next.next.next.next);
    }

    @Test
    public void test3() {
        DeleteTheMiddleNode.ListNode head = DeleteTheMiddleNode.ListNode.of(new int[]{1, 2, 3, 4});
        DeleteTheMiddleNode.ListNode newHead = solution.deleteMiddle(head);

        assertEquals(1, newHead.val);
        assertEquals(2, newHead.next.val);
        assertEquals(4, newHead.next.next.val);
        assertNull(newHead.next.next.next);
    }

    @Test
    public void test4() {
        DeleteTheMiddleNode.ListNode head = DeleteTheMiddleNode.ListNode.of(new int[]{2, 1});
        DeleteTheMiddleNode.ListNode newHead = solution.deleteMiddle(head);

        assertEquals(2, newHead.val);
        assertNull(newHead.next);
    }

}