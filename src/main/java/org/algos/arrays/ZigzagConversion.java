package org.algos.arrays;


public class ZigzagConversion {

    public String convert(String s, int numRows) {
        if (numRows == 1 || numRows >= s.length()) {
            return s;
        }

        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }

        int index = 0;
        int direction = 1;
        for (char c : s.toCharArray()) {
            rows[index].append(c);
            if (index == 0) {
                direction = 1;
            } else if (index == numRows - 1) {
                direction = -1;
            }
            index += direction;
        }

        StringBuilder sb = new StringBuilder();
        for (StringBuilder row : rows) {
                sb.append(row);
        }

        return sb.toString();
    }

}
