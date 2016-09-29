package ua.com.serzh.sortingDismantle;

import java.util.Arrays;

/**
 * Created by serzh on 1/7/16.
 */
public class SelectSort {


    public static void main(String[] args) {

        int[] temp = {7, 2, 5, 8, 1, 2};
        selectSort(temp);
        System.out.println(Arrays.toString(temp));
    }

    private static void selectSort(int[] arr) {
        for (int barrier = 0; barrier < arr.length - 1; barrier++) {
            for (int index = barrier + 1; index < arr.length; index++) {
                if (arr[barrier] > arr[index]) {
                    int tmp = arr[index];
                    arr[index] = arr[barrier];
                    arr[barrier] = tmp;
                }
                System.out.println("in" + Arrays.toString(arr));
            }
            System.out.println("Out" + Arrays.toString(arr) + "\n");
        }
    }
}
