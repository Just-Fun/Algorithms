package ua.com.serzh.merge_sorted_arrays;

import java.util.Arrays;

/**
 * Created by Serzh on 9/20/16.
 */
public class Test {
    public static void main(String[] args) {
        int[] result = Merger.merge(new int[]{}, new int[]{1});

        if (!Arrays.equals(result, new int[]{1})) {
            throw new AssertionError();
        }

        System.out.print("OK");
    }
}
