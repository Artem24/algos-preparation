package org.algos.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductOfArrayExceptSelfTest {

    private final ProductOfArrayExceptSelf self = new ProductOfArrayExceptSelf();

    @Test
    public void test1() {
        assertArrayEquals(new int[]{24, 12, 8, 6}, self.productExceptSelf(new int[]{1, 2, 3, 4}));
        assertArrayEquals(new int[]{0, 0, 9, 0, 0}, self.productExceptSelf(new int[]{-1, 1, 0, -3, 3}));
    }

}