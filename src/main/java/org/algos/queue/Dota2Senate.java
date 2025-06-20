package org.algos.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class Dota2Senate {

    /*
    1. [D,R,D,R]
    2. [D,D]

    1. [D,R,R,D]
    2. [D,R]
    3. [D]

    1. [D,R,R,D,R,D]
    queueD = [0, 3, 5]
    queueR = [1, 2, 4]



    2. [D,R,R]


    3. [R]
     */

    public String predictPartyVictory(String senate) {
        Queue<Integer> dairsPos = new ArrayDeque<>();
        Queue<Integer> radiantsPos = new ArrayDeque<>();
        char[] chars = senate.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'D') {
                dairsPos.add(i);
            } else {
                radiantsPos.add(i);
            }
        }
        int curLastPosition = senate.length();
        while (!dairsPos.isEmpty() && !radiantsPos.isEmpty()) {
            Integer dairPeek = dairsPos.poll();
            Integer radiantPeek = radiantsPos.poll();
            if (dairPeek < radiantPeek) {
                dairsPos.add(curLastPosition++);
            } else {
                radiantsPos.add(curLastPosition++);
            }
        }

        return dairsPos.isEmpty() ? "Radiant" : "Dire";
    }

}
