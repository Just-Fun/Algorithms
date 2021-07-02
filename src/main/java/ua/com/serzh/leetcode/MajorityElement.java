package ua.com.serzh.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/*169. Majority Element
Given an array nums of size n, return the majority element.
The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2

Constraints:

n == nums.length
1 <= n <= 5 * 104
-231 <= nums[i] <= 231 - 1*/
public class MajorityElement {

    public static void main(String[] args) {
        int ints1 = majorityElement(new int[]{3, 2, 3});
        System.out.println(ints1);
        int ints2 = majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2});
        System.out.println(ints2);
        int ints3 = majorityElement(new int[]{2, 7, 11, 15});
        System.out.println(ints3);
    }

    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        Arrays.stream(nums).parallel()
                .forEach(value -> {
                    int count = map.getOrDefault(value, 0);
                    if (count == 0) {
                        map.put(value, 1);
                    } else {
                        map.put(value, count + 1);
                    }
                });

        return map.entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElseThrow(() -> new IllegalArgumentException("Wrong input"));
    }

/*    public static int majorityElementAtomic(int[] nums) {
        final Map<Integer, AtomicInteger> map = new ConcurrentHashMap<>();
        Arrays.stream(nums).parallel()
                .forEach(value -> {
                    map.putIfAbsent(value, new AtomicInteger(0));
                    map.get(value).incrementAndGet();
                });
        return
    }*/
}
