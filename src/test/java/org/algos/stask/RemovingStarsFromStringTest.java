package org.algos.stask;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemovingStarsFromStringTest {

    private final RemovingStarsFromString solution = new RemovingStarsFromString();

    @Test
    public void test1() {
        String ans = solution.removeStars("leet**cod*e");
        assertEquals("lecoe", ans);
    }

    @Test
    public void test2() {
        String ans = solution.removeStars("erase*****");
        assertEquals("", ans);
    }

}