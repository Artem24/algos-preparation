package org.algos.pointers;

public class IsSubsequence {

    public boolean isSubsequence(String s, String t) {
        if(s.isEmpty()) {
            return true;
        }
        if(t.isEmpty() || s.length() > t.length()) {
            return false;
        }
        int posS = 0;
        int posT = 0;

        do {
            if (s.charAt(posS) == t.charAt(posT)) {
                posS++;
                if(posS == s.length()) {
                    return true;
                }
            }
            posT++;
        } while (posT < t.length());

        return false;
    }

}
