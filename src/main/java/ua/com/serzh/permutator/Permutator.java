package ua.com.serzh.permutator;

import java.util.Arrays;

/**
 * Created by Oleg on 11/28/2015.
 */
public class Permutator {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        permutation(arr, 4);
        System.out.println(Arrays.toString(arr));
    }

    public static void permutation(int[] list, int size) {
        if (size == 1) {
            System.out.println(Arrays.toString(list));
        } else {
            for (int k = 0; k < size; k++) {
                swap(list, k, size - 1);
                permutation(list, size - 1);
                swap(list, k, size - 1);
            }
        }
    }

    private static void swap(int[] list, int index0, int index1) {
        int tmp = list[index0];
        list[index0] = list[index1];
        list[index1] = tmp;
    }
}
