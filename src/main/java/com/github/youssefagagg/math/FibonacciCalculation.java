package com.github.youssefagagg.math;

import java.math.BigInteger;

public class FibonacciCalculation {

    public static long fibonacciRecurs(int n) {
        if (n < 0) throw new IllegalArgumentException("can't be less than zero");
        if (n <= 1) return n;
        return fibonacciRecurs(n - 1) + fibonacciRecurs(n - 2);
    }

    public static long fibonacciEnhance(int n) {
        if (n < 0) throw new IllegalArgumentException("can't be less than zero");
        if (n <= 1) return n;
        long[] fibonacciArr = new long[n + 1];
        fibonacciArr[0] = 0;
        fibonacciArr[1] = 1;
        for (int i = 2; i <= n; i++) {
            fibonacciArr[i] = fibonacciArr[i - 1] + fibonacciArr[i - 2];
        }
        return fibonacciArr[n];
    }

    public static BigInteger fibonacciEnhanceBigInteger(int n) {
        if (n < 0) throw new IllegalArgumentException("can't be less than zero");
        if (n <= 1) return BigInteger.valueOf(n);
        BigInteger[] fibonacciArr = new BigInteger[n + 1];
        fibonacciArr[0] = BigInteger.ZERO;
        fibonacciArr[1] = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            fibonacciArr[i] = fibonacciArr[i - 1].add(fibonacciArr[i - 2]);
        }
        return fibonacciArr[n];
    }
}
