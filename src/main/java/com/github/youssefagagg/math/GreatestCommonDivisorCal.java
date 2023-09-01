package com.github.youssefagagg.math;

import static java.lang.Math.abs;

public class GreatestCommonDivisorCal {

    public static long naiveGCDCal(long firstNum, long secondNum) {
        long min = Math.min(abs(firstNum), abs(secondNum));
        long maxDisisor = Long.MIN_VALUE;
        for (long i = 1; i <= min; i++) {
            if (firstNum % i == 0 && secondNum % i == 0 && maxDisisor < i) {
                maxDisisor = i;
            }
        }
        return maxDisisor;
    }

    /**
     * calculate the greatest common divisor using Euclidean algorithm.
     *
     * @param firstNum  the first num
     * @param secondNum the second num
     * @return the long
     */
    public static long euclideanGCDCal(long firstNum, long secondNum) {
        if (secondNum == 0) return firstNum;
        long firstNumReminder = firstNum % secondNum;
        return abs(euclideanGCDCal(secondNum, firstNumReminder));

    }
}
