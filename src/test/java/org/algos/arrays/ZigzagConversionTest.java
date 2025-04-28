package org.algos.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZigzagConversionTest {

    private final ZigzagConversion zigzagConversion = new ZigzagConversion();

    @Test
    public void test1() {
        assertEquals("PAHNAPLSIIGYIR", zigzagConversion.convert("PAYPALISHIRING", 3));
    }

}