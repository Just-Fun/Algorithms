package ua.com.serzh.permutator;

/**
 * Created by serzh on 12/5/15.
 */

//import java.util.ArrayList;

import java.util.Arrays;
//import java.util.List;

// хватит извращаться :)

public class Permutat {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        permutation(arr, 3);
        /*int[] arr = {1};
        permutation(arr, 1);*/
        /*int[] arr = new int[0];
        permutation(arr, 0);*/
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