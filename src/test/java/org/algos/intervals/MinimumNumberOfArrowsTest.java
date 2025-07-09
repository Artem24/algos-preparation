package org.algos.intervals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumNumberOfArrowsTest {

    private static final MinimumNumberOfArrows solution = new MinimumNumberOfArrows();

    @Test
    public void test1() {
        int minArrowShots = solution.findMinArrowShots(new int[][]{{10, 16}, {2, 8}, {1, 6}, {7, 12}});
        assertEquals(2, minArrowShots);
    }

    @Test
    public void test2() {
        int minArrowShots = solution.findMinArrowShots(new int[][]{{1,2},{3,4},{5,6},{7,8}});
        assertEquals(4, minArrowShots);
    }

    @Test
    public void test3() {
        int minArrowShots = solution.findMinArrowShots(new int[][]{{1,2},{2,3},{3,4},{4,5}});
        assertEquals(2, minArrowShots);
    }

    @Test
    public void test4() {
        int minArrowShots = solution.findMinArrowShots(new int[][]{{3,9},{7,12},{3,8},{6,8},{9,10},{2,9},{0,9},{3,9},{0,6},{2,8}});
        assertEquals(2, minArrowShots);
    }

}