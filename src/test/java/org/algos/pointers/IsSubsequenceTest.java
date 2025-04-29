package org.algos.pointers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsSubsequenceTest {

    private final IsSubsequence isSubsequence = new IsSubsequence();

    @Test
    public void test1() {
        assertEquals(true, isSubsequence.isSubsequence("abc", "ahbgdc"));
        assertEquals(true, isSubsequence.isSubsequence("", "ahbgdc"));
        assertEquals(false, isSubsequence.isSubsequence("axc", ""));
        assertEquals(false, isSubsequence.isSubsequence("axc", "ahbgdc"));
        assertEquals(false, isSubsequence.isSubsequence("axcc", "axc"));
    }

}