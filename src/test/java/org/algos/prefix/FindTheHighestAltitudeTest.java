package org.algos.prefix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindTheHighestAltitudeTest {

    private final FindTheHighestAltitude solution = new FindTheHighestAltitude();

    @Test
    public void test1() {
        int ans = solution.largestAltitude(new int[]{-5, 1, 5, 0, -7});
        assertEquals(1, ans);
    }

    @Test
    public void test2() {
        int ans = solution.largestAltitude(new int[]{-4,-3,-2,-1,4,3,2});
        assertEquals(0, ans);
    }

}