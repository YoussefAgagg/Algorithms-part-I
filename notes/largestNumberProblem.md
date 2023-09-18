```java
    /**
 * Given a list of non-negative integers nums, arrange them such that they form the largest number and return it.
 *
 * Since the result may be very large, so you need to return a string instead of an integer.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [10,2]
 * Output: "210"
 * Example 2:
 *
 * Input: nums = [3,30,34,5,9]
 * Output: "9534330"
 *
 *
 * Constraints:
 *
 * 1 <= nums.length <= 100
 * 0 <= nums[i] <= 10^9
 */
public static String largestNumber(int[]numbers){

        String result=Arrays.stream(numbers).mapToObj(String::valueOf)
        .sorted((o1,o2)->(o2+o1).compareTo(o1+o2))
        .collect(Collectors.joining());
        if(result.startsWith("0"))return"0";
        return result;

        }
```