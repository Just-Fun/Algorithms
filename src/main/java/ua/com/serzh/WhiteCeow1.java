package ua.com.serzh;

import java.util.Date;
import java.util.Random;

/**
 * Created by serzh on 11/26/15.
 */
public class WhiteCeow1 {

    public static final int ERROR_CODE = -1;

    public static void main(String[] args) {
        long start = new Date().getTime();
        int[] nums = new int[10000];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = new Random().nextInt(100);
        }

//        int[] test = {1, 2, 4, 1, 5, 9, 2, 5, 4};
        int ans = WhiteCeow1.findNum(nums);
        long now = new Date().getTime();
        System.out.println("Time in mills: " + (now - start));
        System.out.println(ans);
       /* int a = 1;
        int b = 1;
        int c = a ^ b;
        System.out.println(c);*/

    }

    private static int findNum(int[] arr) {
        int ans = getAns(arr, 0);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ans) {
                return i;
            }
        //test
        //test2
        }
        return ERROR_CODE;
    }

    private static int getAns(int[] arr, int ans) {
        for (int i : arr) {
            ans ^= i;
        }
        return ans;
    }
}
