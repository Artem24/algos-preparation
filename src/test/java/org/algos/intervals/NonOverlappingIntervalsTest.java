package org.algos.intervals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NonOverlappingIntervalsTest {

    private static final NonOverlappingIntervals solution = new NonOverlappingIntervals();

    @Test
    public void test1() {
        int result = solution.eraseOverlapIntervals(new int[][]{{1, 2}, {2, 3}, {3, 4}, {1, 3}});

        assertEquals(1, result);
    }

    @Test
    public void test2() {
        int result = solution.eraseOverlapIntervals(new int[][]{{1, 100}, {11, 22}, {1, 11}, {2, 12}});

        assertEquals(2, result);
    }

}