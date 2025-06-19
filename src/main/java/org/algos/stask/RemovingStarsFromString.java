package org.algos.stask;

import java.util.Stack;

public class RemovingStarsFromString {

    public String removeStars(String s) {
        char[] charsStr = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char c : charsStr) {
            if (c == '*') {
                sb.setLength(sb.length() - 1);
            } else {
                sb.append(c);
            }
        }

        return sb.toString();
    }

}
