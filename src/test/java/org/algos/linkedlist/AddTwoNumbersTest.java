package org.algos.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddTwoNumbersTest {

    private final AddTwoNumbers solution = new AddTwoNumbers();

    @Test
    public void test1() {
        AddTwoNumbers.ListNode l1 =
                new AddTwoNumbers.ListNode(2,
                        new AddTwoNumbers.ListNode(4,
                                new AddTwoNumbers.ListNode(3))
                );

        AddTwoNumbers.ListNode l2 =
                new AddTwoNumbers.ListNode(5,
                        new AddTwoNumbers.ListNode(6,
                                new AddTwoNumbers.ListNode(4))
                );

        AddTwoNumbers.ListNode listNode = solution.addTwoNumbers(l1, l2);
        assertEquals(7, listNode.val);
        assertEquals(0, listNode.next.val);
        assertEquals(8, listNode.next.next.val);
        assertNull(listNode.next.next.next);
    }

    @Test
    public void test2() {

        AddTwoNumbers.ListNode l1 =
                new AddTwoNumbers.ListNode(9,
                        new AddTwoNumbers.ListNode(9,
                                new AddTwoNumbers.ListNode(9,
                                        new AddTwoNumbers.ListNode(9,
                                                new AddTwoNumbers.ListNode(9,
                                                        new AddTwoNumbers.ListNode(9,
                                                                new AddTwoNumbers.ListNode(9)))))));

        AddTwoNumbers.ListNode l2 =
                new AddTwoNumbers.ListNode(9,
                        new AddTwoNumbers.ListNode(9,
                                new AddTwoNumbers.ListNode(9,
                                        new AddTwoNumbers.ListNode(9))));

        AddTwoNumbers.ListNode listNode = solution.addTwoNumbers(l1, l2);
        assertEquals(8, listNode.val);
        assertEquals(9, listNode.next.val);
        assertEquals(9, listNode.next.next.val);
        assertEquals(9, listNode.next.next.next.val);
        assertEquals(0, listNode.next.next.next.next.val);
        assertEquals(0, listNode.next.next.next.next.next.val);
        assertEquals(0, listNode.next.next.next.next.next.next.val);
        assertEquals(1, listNode.next.next.next.next.next.next.next.val);
        assertNull(listNode.next.next.next.next.next.next.next.next);
    }

}