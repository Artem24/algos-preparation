package org.algos.queue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Dota2SenateTest {

    private final Dota2Senate solution = new Dota2Senate();

    @Test
    public void test1() {
        String ans = solution.predictPartyVictory("RD");
        assertEquals("R", ans);
    }

    @Test
    public void test2() {
        String ans = solution.predictPartyVictory("RDD");
        assertEquals("D", ans);
    }

    @Test
    public void test3() {
        String ans = solution.predictPartyVictory("DRRDRD");
        assertEquals("R", ans);
    }

}