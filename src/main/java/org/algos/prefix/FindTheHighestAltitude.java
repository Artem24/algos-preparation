package org.algos.prefix;

public class FindTheHighestAltitude {

    // gain = [-5,1,5,0,-7]
//    [0, -5, -4, 1, 1, -6]

    public int largestAltitude(int[] gain) {
        int prev = 0;
        int cur = 0;
        int max = 0;
        for (int i = 0; i < gain.length; i++) {
                cur = prev + gain[i];
                max = Math.max(cur, max);
                prev = cur;
        }

        return max;
    }

}
