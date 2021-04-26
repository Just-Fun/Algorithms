package ua.com.serzh.leetcode;

import java.util.Arrays;

/*167. Two Sum II - Input array is sorted
Share
Given an array of integers numbers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.
Return the indices of the two numbers (1-indexed) as an integer array answer of size 2, where 1 <= answer[0] < answer[1] <= numbers.length.
You may assume that each input would have exactly one solution and you may not use the same element twice.

Example 1:

Input: numbers = [2,7,11,15], target = 9
Output: [1,2]
Explanation: The sum of 2 and 7 is 9. Therefore index1 = 1, index2 = 2.
Example 2:

Input: numbers = [2,3,4], target = 6
Output: [1,3]
Example 3:

Input: numbers = [-1,0], target = -1
Output: [1,2]


Constraints:

2 <= numbers.length <= 3 * 104
-1000 <= numbers[i] <= 1000
numbers is sorted in increasing order.
-1000 <= target <= 1000
Only one valid answer exists.
*/
public class TwoSumSolutionOrdered {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int[] ints1 = twoSum(nums, 9);
        System.out.println(Arrays.toString(ints1));
        int[] ints2 = twoSum(nums, 17);
        System.out.println(Arrays.toString(ints2));
        int[] ints3 = twoSum(nums, 15);
        System.out.println(Arrays.toString(ints3));

        int[] ints4 = twoSum(new int[]{2,3,4}, 6);
        System.out.println(Arrays.toString(ints4));

        int[] ints5 = twoSum(new int[]{-1,0}, -1);
        System.out.println(Arrays.toString(ints5));
    }

    private static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[]{i + 1, j + 1};
                }
            }
        }
//        return null;
        throw new IllegalArgumentException("No two sum solution");
    }
}

// 1
// 2
// 3
