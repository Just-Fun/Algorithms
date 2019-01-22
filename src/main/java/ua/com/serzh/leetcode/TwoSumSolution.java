package ua.com.serzh.leetcode;

import java.util.Arrays;

/*Given an array of integers, return indices of the two numbers such that they add up to a specific target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
Example:
Given nums = [2, 7, 11, 15], target = 9,
Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].*/
public class TwoSumSolution {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int[] ints1 = twoSum(nums, 9);
        System.out.println(Arrays.toString(ints1));
        int[] ints2 = twoSum(nums, 17);
        System.out.println(Arrays.toString(ints2));
        int[] ints3 = twoSum(nums, 15);
        System.out.println(Arrays.toString(ints3));
    }

    private static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}

// 1
// 2
// 3
