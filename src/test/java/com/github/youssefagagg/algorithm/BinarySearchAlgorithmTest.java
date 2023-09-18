package com.github.youssefagagg.algorithm;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class BinarySearchAlgorithmTest {

    @Test
    void binarySearch() {
        assertThat(BinarySearchAlgorithm
                .binarySearch(new int[]{1}, 1))
                .isZero();
        assertThat(BinarySearchAlgorithm
                .binarySearch(new int[]{1}, 2))
                .isEqualTo(-1);
        assertThat(BinarySearchAlgorithm
                .binarySearch(new int[]{}, 1)).isEqualTo(-1);
        assertThat(BinarySearchAlgorithm
                .binarySearch(new int[]{1, 2}, 2))
                .isEqualTo(1);
        assertThat(BinarySearchAlgorithm
                .binarySearch(new int[]{1, 2}, 1))
                .isZero();
        assertThat(BinarySearchAlgorithm
                .binarySearch(new int[]{1, 2, 3}, 2))
                .isEqualTo(1);
        assertThat(BinarySearchAlgorithm
                .binarySearch(new int[]{1, 2, 3}, 3))
                .isEqualTo(2);
        assertThat(BinarySearchAlgorithm
                .binarySearch(new int[]{1, 2, 3}, 1))
                .isZero();
        assertThat(BinarySearchAlgorithm
                .binarySearch(new int[]{1, 2, 3, 4, 5}, 5))
                .isEqualTo(4);
        assertThat(BinarySearchAlgorithm
                .binarySearch(new int[]{1, 2, 3, 4, 5, 5, 6}, 5))
                .isIn(4, 5);
        assertThat(BinarySearchAlgorithm
                .binarySearch(new int[]{1, 2, 3, 4, 5, 5, 7, 8, 9, 10}, 1))
                .isZero();
        assertThat(BinarySearchAlgorithm
                .binarySearch(new int[]{1, 2, 4, 5, 6, 7}, 3))
                .isEqualTo(-1);
        assertThat(BinarySearchAlgorithm
                .binarySearch(new int[]{1, 2, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 101}, 101))
                .isEqualTo(12);
        assertThat(BinarySearchAlgorithm
                .binarySearch(new int[]{1, 2, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 101}, 1))
                .isZero();
        assertThat(BinarySearchAlgorithm
                .binarySearch(new int[]{1, 2, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 101}, 11))
                .isEqualTo(9);
        assertThat(BinarySearchAlgorithm
                .binarySearch(new int[]{1, 2, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13}, 11))
                .isEqualTo(9);
        assertThat(BinarySearchAlgorithm
                .binarySearch(new int[]{1, 2, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13}, 13))
                .isEqualTo(11);
        assertThat(BinarySearchAlgorithm
                .binarySearch(new int[]{1, 2, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 111, 1111, 11111, 22222}, 13))
                .isEqualTo(11);
    }
}