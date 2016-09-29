package ua.com.serzh.merge_sorted_arrays;

import java.util.Arrays;

/**
 * Created by Serzh on 9/20/16.
 */
public class Merger {
    public static void main(String[] args) {
        int[] fst = new int[] {3,6,9};
        int[] snd = new int[] {1,5,11,12};
        int[] test = new int[] {};
        int[] test1 = new int[] {1};
        int[] result = new int[test.length + test1.length];
        System.out.println(result.length);
        int[] merge = merge(test, test1);
        System.out.println(Arrays.toString(merge));

    }
    // wrong
    public static int[] merge(int[] fst, int[] snd) {
        int[] result = new int[fst.length + snd.length];
        int aIndex = 0;
        int bIndex = 0;
        int rIndex = 0;

        while (rIndex < result.length) {
            if (aIndex == fst.length) {
                System.arraycopy(snd, bIndex, result, rIndex, snd.length - bIndex);
                break;
            }
            if (bIndex == snd.length) {
                System.arraycopy(fst, aIndex, result, rIndex, fst.length - aIndex);
                break;
            }
            result[rIndex] = (fst[aIndex] < snd[bIndex]) ? fst[aIndex++] : snd[bIndex++];
            rIndex++;
        }
        return result;
    }
}
