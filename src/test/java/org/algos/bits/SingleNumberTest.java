package org.algos.bits;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingleNumberTest {

    private final SingleNumber solution = new SingleNumber();

    @Test
    public void test1() {
        int ans = solution.singleNumber(new int[]{2, 2, 1});
        assertEquals(1, ans);
    }

    @Test
    public void test2() {
        int ans = solution.singleNumber(new int[]{4, 1, 2, 1, 2});
        assertEquals(4, ans);
    }

    @Test
    public void test3() {
        int ans = solution.singleNumber(new int[]{1});
        assertEquals(1, ans);
    }

}