package org.algos.arrays;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class KidsWithTheGreatestNumberOfCandiesTest {

    private final KidsWithTheGreatestNumberOfCandies kids = new KidsWithTheGreatestNumberOfCandies();

    @Test
    public void  test1() {
        assertEquals(Arrays.asList(true,true,true,false,true), kids.kidsWithCandies(new int[]{2,3,5,1,3}, 3));
    }

}