package ua.com.serzh.permutator;

/**
 * Created by serzh on 12/5/15.
 */

//import java.util.ArrayList;

import java.util.Arrays;
//import java.util.List;

// хватит извращаться :)

public class Permutator1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        permutation(arr, 4);
        /*int[] arr = {1};
        permutation(arr, 1);*/
        /*int[] arr = new int[0];
        permutation(arr, 0);*/
    }


    public static void permutation(int[] list, int size) {
        int num = numFind(size);
        if (list.length == 0 || list.length == 1) {
            System.out.println(Arrays.toString(list));
        } else {
            int index1 = list.length - 2;
            while (num > 0) {
                if (index1 < 0) index1 = list.length - 2;
                swap(list, index1 + 1, index1);
                System.out.println(Arrays.toString(list));
                num -= 1;
                index1 -= 1;
            }
        }
    }

    public static int numFind (int x) {
        return x ==  0 ? 1 : x * numFind(x - 1);
    }


    private static void swap(int[] list, int index0, int index1) {
        int tmp = list[index0];
        list[index0] = list[index1];
        list[index1] = tmp;
    }
}