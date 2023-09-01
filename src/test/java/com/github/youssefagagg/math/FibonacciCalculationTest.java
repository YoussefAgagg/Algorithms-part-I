package com.github.youssefagagg.math;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class FibonacciCalculationTest {

    @Test
    void fibonacciRecurs() {
        assertThat(FibonacciCalculation.fibonacciRecurs(0)).isZero();
        assertThat(FibonacciCalculation.fibonacciRecurs(1)).isOne();
        assertThat(FibonacciCalculation.fibonacciRecurs(2)).isOne();
        assertThat(FibonacciCalculation.fibonacciRecurs(3)).isEqualTo(2L);
        assertThat(FibonacciCalculation.fibonacciRecurs(4)).isEqualTo(3L);
        assertThat(FibonacciCalculation.fibonacciRecurs(5)).isEqualTo(5L);
        assertThat(FibonacciCalculation.fibonacciRecurs(6)).isEqualTo(8L);
        assertThat(FibonacciCalculation.fibonacciRecurs(7)).isEqualTo(13L);
        assertThat(FibonacciCalculation.fibonacciRecurs(8)).isEqualTo(21L);
        assertThat(FibonacciCalculation.fibonacciRecurs(50)).isEqualTo(12586269025L); // will take a lot of time to finish the calculation
    }

    @Test
    void fibonacciEnhance() {
        assertThat(FibonacciCalculation.fibonacciEnhance(0)).isZero();
        assertThat(FibonacciCalculation.fibonacciEnhance(1)).isOne();
        assertThat(FibonacciCalculation.fibonacciEnhance(2)).isOne();
        assertThat(FibonacciCalculation.fibonacciEnhance(3)).isEqualTo(2L);
        assertThat(FibonacciCalculation.fibonacciEnhance(4)).isEqualTo(3L);
        assertThat(FibonacciCalculation.fibonacciEnhance(5)).isEqualTo(5L);
        assertThat(FibonacciCalculation.fibonacciEnhance(6)).isEqualTo(8L);
        assertThat(FibonacciCalculation.fibonacciEnhance(7)).isEqualTo(13L);
        assertThat(FibonacciCalculation.fibonacciEnhance(8)).isEqualTo(21L);
        assertThat(FibonacciCalculation.fibonacciEnhance(50)).isEqualTo(12586269025L); //faster
        // assertThat(FibonacciCalculation.fibonacciEnhance(100)).isEqualTo(354224848179261915075L);  the result will exceed long  size limit
    }

    @Test
    void fibonacciEnhanceBigInteger() {
        assertThat(FibonacciCalculation.fibonacciEnhanceBigInteger(0)).isZero();
        assertThat(FibonacciCalculation.fibonacciEnhanceBigInteger(1)).isOne();
        assertThat(FibonacciCalculation.fibonacciEnhanceBigInteger(2)).isOne();
        assertThat(FibonacciCalculation.fibonacciEnhanceBigInteger(3)).isEqualTo(2L);
        assertThat(FibonacciCalculation.fibonacciEnhanceBigInteger(4)).isEqualTo(3L);
        assertThat(FibonacciCalculation.fibonacciEnhanceBigInteger(5)).isEqualTo(5L);
        assertThat(FibonacciCalculation.fibonacciEnhanceBigInteger(6)).isEqualTo(8L);
        assertThat(FibonacciCalculation.fibonacciEnhanceBigInteger(7)).isEqualTo(13L);
        assertThat(FibonacciCalculation.fibonacciEnhanceBigInteger(8)).isEqualTo(21L);
        assertThat(FibonacciCalculation.fibonacciEnhanceBigInteger(50)).isEqualTo(12586269025L); //faster
        assertThat(FibonacciCalculation.fibonacciEnhanceBigInteger(100)).isEqualTo("354224848179261915075");  // works fine

    }
}