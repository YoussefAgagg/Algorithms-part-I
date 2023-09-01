package com.github.youssefagagg.math;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class GreatestCommonDivisorCalTest {

    @Test
    void naiveGCDCal() {
        assertThat(GreatestCommonDivisorCal.naiveGCDCal(1, 1)).isOne();
        assertThat(GreatestCommonDivisorCal.naiveGCDCal(1, -1)).isOne();
        assertThat(GreatestCommonDivisorCal.naiveGCDCal(-1, -1)).isOne();
        assertThat(GreatestCommonDivisorCal.naiveGCDCal(100, 10)).isEqualTo(10);
        assertThat(GreatestCommonDivisorCal.naiveGCDCal(-100, 10)).isEqualTo(10);
        assertThat(GreatestCommonDivisorCal.naiveGCDCal(100, -10)).isEqualTo(10);
        assertThat(GreatestCommonDivisorCal.naiveGCDCal(1736960, 7129088)).isEqualTo(15104);
        assertThat(GreatestCommonDivisorCal.naiveGCDCal(3918848, 1653264)).isEqualTo(61232);
        assertThat(GreatestCommonDivisorCal.naiveGCDCal((long) Math.pow(10, 10), (long) Math.pow(10, 15)))
                .isEqualTo((long) Math.pow(10, 10)); // will take some time
        // assertThat(GreatestCommonDivisorCal.naiveGCDCal(Long.MAX_VALUE,Long.MAX_VALUE)).isEqualTo(Long.MAX_VALUE); // will take infinity haha haha
    }

    @Test
    void euclideanGCDCal() {
        assertThat(GreatestCommonDivisorCal.euclideanGCDCal(1, 1)).isOne();
        assertThat(GreatestCommonDivisorCal.euclideanGCDCal(1, -1)).isOne();
        assertThat(GreatestCommonDivisorCal.euclideanGCDCal(-1, -1)).isOne();
        assertThat(GreatestCommonDivisorCal.euclideanGCDCal(100, 10)).isEqualTo(10);
        assertThat(GreatestCommonDivisorCal.euclideanGCDCal(-100, 10)).isEqualTo(10);
        assertThat(GreatestCommonDivisorCal.euclideanGCDCal(100, -10)).isEqualTo(10);
        assertThat(GreatestCommonDivisorCal.euclideanGCDCal(1736960, 7129088)).isEqualTo(15104);
        assertThat(GreatestCommonDivisorCal.euclideanGCDCal(3918848, 1653264)).isEqualTo(61232);
        assertThat(GreatestCommonDivisorCal.euclideanGCDCal((long) Math.pow(10, 10), (long) Math.pow(10, 15)))
                .isEqualTo((long) Math.pow(10, 10));
        assertThat(GreatestCommonDivisorCal.euclideanGCDCal(Long.MAX_VALUE, Long.MAX_VALUE)).isEqualTo(Long.MAX_VALUE);

    }
}