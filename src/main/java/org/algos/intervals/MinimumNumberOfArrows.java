package org.algos.intervals;

import java.util.Arrays;
import java.util.Comparator;

public class MinimumNumberOfArrows {

    /*
    0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16
                        --------------------
        -------------
      -----------
                  ---------------
                  
      sorting
      
      -----------
        -------------
                ^ ---------------
                |        --------------------
                |                ^
                                 | 
     */

    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, Comparator.comparingInt(array -> array[1]));

        int arrowsAmount = 1;
        int rightPoint = points[0][1];
        for (int i = 1; i < points.length; i++) {
            if (points[i][0] > rightPoint) {
                arrowsAmount++;
                rightPoint = points[i][1];
            }
        }

        return arrowsAmount;
    }

}
