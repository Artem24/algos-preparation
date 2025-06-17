package org.algos.stask;

import java.util.Stack;

public class DecodeString {

//    Input: s = "3[a]2[bc]"
//    Output: "aaabcbc"


    // d1 = 3   s1 = a
    // res = 3 * a
    // d1 = 2   s1 = bc
    // res += 2 * bc


//    Input: s = "3[a2[c]]"
//    Output: "accaccacc"
    /*
    digits[3] builders[] cur -> a
    digits[3, 2] builders[a] cur -> c

    a.append c x 2
    acc.append x 3

    a -> acc -> accacc -> accaccacc

    3   a
    2   c
     */


    // d1 = 3   s1 = a
    // d2 = 2   s2 = c
    // res = 2 * c

    public String decodeString(String s) {
        char ch;
        int curDigit = 0;
        StringBuilder curSb = new StringBuilder();
        Stack<StringBuilder> sbStack = new Stack<>();
        Stack<Integer> digits = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                curDigit = curDigit * 10 + ch - '0';
                continue;
            }
            if (ch == '[') {
                digits.push(curDigit);
                curDigit = 0;
                sbStack.push(curSb);
                curSb = new StringBuilder();
            } else if (ch == ']') {
                Integer lastDigit = digits.pop();
                StringBuilder temp = curSb;
                curSb = sbStack.pop();
                for (int j = 0; j < lastDigit; j++) {
                    curSb.append(temp);
                }
            } else {
                curSb.append(ch);
            }
        }

        return curSb.toString();
    }

}
