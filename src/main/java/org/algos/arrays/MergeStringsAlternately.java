package org.algos.arrays;

public class MergeStringsAlternately {

    public String mergeAlternately(String word1, String word2) {
        if (word1 == null || word1.isEmpty()) {
            return word2;
        }
        if (word2 == null || word2.isEmpty()) {
            return word1;
        }

        char[] buffer = new char[word1.length() + word2.length()];

        int bufferPos = 0;
        for (int i = 0; i < word1.length() + word2.length(); i++) {
            if (i < word1.length()) {
                buffer[bufferPos++] = word1.charAt(i);
            }
            if (i < word2.length()) {
                buffer[bufferPos++] = word2.charAt(i);
            }
        }

        return new String(buffer);
    }

}
