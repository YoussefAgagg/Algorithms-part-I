package com.github.youssefagagg.algorithm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LargestNumberTest {

    @Test
    void largestNumberStream() {
       // Prepare test data
       int[] numbers = {3, 30, 34, 5, 9};
       String expected = "9534330";

       // Execute method
       String result = LargestNumber.largestNumberStream(numbers);

       // Check results
       assertEquals(expected, result);

       // New test case
       numbers = new int[] {10, 2};
       expected = "210";
       result = LargestNumber.largestNumberStream(numbers);
       assertEquals(expected, result);

       // New test case
       numbers = new int[] {0, 0};
       expected = "0";
       result = LargestNumber.largestNumberStream(numbers);
       assertEquals(expected, result);
    }

    @Test
    void largestNumber() {
       // Prepare test data
       int[] numbers = {3, 30, 34, 5, 9};
       String expected = "9534330";

       // Execute method
       String result = LargestNumber.largestNumber(numbers);

       // Check results
       assertEquals(expected, result);

       // New test case
       numbers = new int[] {10, 2};
       expected = "210";
       result = LargestNumber.largestNumber(numbers);
       assertEquals(expected, result);

       // New test case
       numbers = new int[] {0, 0};
       expected = "0";
       result = LargestNumber.largestNumber(numbers);
       assertEquals(expected, result);
   }
}