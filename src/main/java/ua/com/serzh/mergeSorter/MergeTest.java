package ua.com.serzh.mergeSorter;

import java.util.Arrays;

/**
 * Created by serzh on 11/30/15.
 */
public class MergeTest {
    public static void main(String[] args) {
        int[] arr = {1,2,5,6};
        int[] test = Arrays.copyOfRange(arr, 0, 2);
        System.out.println(Arrays.toString(test));
    }
}
