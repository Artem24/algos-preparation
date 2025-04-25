package org.algos.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeStringsAlternatelyTest {

    private MergeStringsAlternately merger = new MergeStringsAlternately();

    @Test
    public void test1() {
        assertEquals("axbycz", merger.mergeAlternately("abc", "xyz"));
        assertEquals("apbqrs", merger.mergeAlternately("ab", "pqrs"));
        assertEquals("apbqcd", merger.mergeAlternately("abcd", "pq"));
    }

}