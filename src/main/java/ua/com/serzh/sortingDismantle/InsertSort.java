package ua.com.serzh.sortingDismantle;

import java.util.Arrays;

/**
 * Created by serzh on 1/7/16.
 */
public class InsertSort {

    private static void insertSort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            int newElement = arr[i];
            int location = i - 1;
            while (location >= 0 && arr[location] > newElement) {
                arr[location + 1] = arr[location];
                location--;
            }
            arr[location + 1] = newElement;
            System.out.println(Arrays.toString(arr));
        }
    }
}
