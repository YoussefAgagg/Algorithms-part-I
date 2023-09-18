package com.github.youssefagagg.algorithm;


public class BinarySearchAlgorithm {

    /**
     * Binary search int.
     * 1 2 3 4 5
     *
     * @param numbers the array numbers
     * @param theNum  the num wanted to be searched in the array
     * @return the index of the number in the array or -1 if the number not exists in the array
     */
    public static int binarySearch(int[] numbers, int theNum) {
        int low = 0;
        int high = numbers.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (numbers[mid] == theNum) {
                return mid;
            } else if (numbers[mid] < theNum) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

}
