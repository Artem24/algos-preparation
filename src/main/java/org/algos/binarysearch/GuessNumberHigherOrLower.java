package org.algos.binarysearch;

public class GuessNumberHigherOrLower {

    private final int number;

    public GuessNumberHigherOrLower(int number) {
        this.number = number;
    }

    /**
     * Forward declaration of guess API.
     *
     * @param num your guess
     * @return -1 if num is higher than the picked number
     * 1 if num is lower than the picked number
     * otherwise return 0
     * int guess(int num);
     */



    public int guessNumber(int n) {
        int ans = 0;
        int mid = 0;
        int low = 0;
        int high = n;
        for (; ; ) {
            mid = low + (high - low) / 2;
            ans = guess(mid);
            if (ans == 0) {
                return mid;
            } else if (ans == -1) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
    }

    private int guess(int guess) {
        return Integer.compare(number, guess);
    }
}
