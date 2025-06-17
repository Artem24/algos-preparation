package org.algos.binarysearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GuessNumberHigherOrLowerTest {

    private GuessNumberHigherOrLower solution;

    @Test
    public void test1() {
        int number = 6;
        solution = new GuessNumberHigherOrLower(number);
        int ans = solution.guessNumber(10);
        assertEquals(number, ans);
    }

    @Test
    public void test2() {
        int number = 1;
        solution = new GuessNumberHigherOrLower(number);
        int ans = solution.guessNumber(1);
        assertEquals(number, ans);
    }

    @Test
    public void test3() {
        int number = 2;
        solution = new GuessNumberHigherOrLower(number);
        int ans = solution.guessNumber(2);
        assertEquals(number, ans);
    }
    @Test
    public void test4() {
        int number = 2;
        solution = new GuessNumberHigherOrLower(number);
        int ans = solution.guessNumber(1);
        assertEquals(number, ans);
    }

}