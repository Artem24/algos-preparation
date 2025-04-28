package org.algos.arrays;

import java.util.ArrayList;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxValue = 0;
        for (int candy : candies) {
            maxValue = Math.max(maxValue, candy);
        }

        List<Boolean> result = new ArrayList<>(candies.length);
        for (int candy : candies) {
            result.add(candy + extraCandies >= maxValue ? Boolean.TRUE : Boolean.FALSE);
        }

        return result;
    }

}
