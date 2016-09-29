package ua.com.serzh.selectionSorter;

import java.util.Arrays;

/**
 * Created by Oleg on 11/24/2015.
 */
public class SelectionSorter {
    public static void main(String[] args) {
        int[] ans = {3, 4, 6, 1, 3};
        SelectionSorter.sort(ans);
        System.out.println(Arrays.toString(ans));
    }

    public static void sort(int[] arr) {
        for (int barrier = 0; barrier < arr.length - 1; barrier++) {
            int min = arr[barrier];
            int minIndex = barrier;
            for (int index = barrier + 1; index < arr.length; index++) {
                if (min > arr[index]) {
                    min = arr[index];
                    minIndex = index;
                }
            }
            arr[minIndex] = arr[barrier];
            arr[barrier] = min;
        }
    }
}

