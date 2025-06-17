package org.algos.stask;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecodeStringTest {

    private static DecodeString solution = new DecodeString();

    @Test
    public void test1() {
        String s = solution.decodeString("3[a]2[bc]");
        assertEquals("aaabcbc", s);
    }

    @Test
    public void test2() {
        String s = solution.decodeString("3[a2[c]]");
        assertEquals("accaccacc", s);
    }

    @Test
    public void test3() {
        String s = solution.decodeString("2[abc]3[cd]ef");
        assertEquals("abcabccdcdcdef", s);
    }

}