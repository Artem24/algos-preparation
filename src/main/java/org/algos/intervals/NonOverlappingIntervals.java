package org.algos.intervals;

import java.util.Arrays;
import java.util.Comparator;

public class NonOverlappingIntervals {

    /*
    [1,2], [2,4], [3,4], [4, 5]
     */

    public int eraseOverlapIntervals(int[][] intervals) {

        Arrays.sort(intervals, Comparator.comparingInt(value -> value[1]));

        int toRemove = 0;
        int lastIntervalIndex = 0;
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[lastIntervalIndex][1] > intervals[i][0]) {
                toRemove++;
            } else {
                lastIntervalIndex = i;
            }
        }

        return toRemove;
    }

}
