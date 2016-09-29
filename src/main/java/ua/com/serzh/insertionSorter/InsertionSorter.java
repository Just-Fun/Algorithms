package ua.com.serzh.insertionSorter;

import java.util.Arrays;

/**
 * Created by Oleg on 11/26/2015.
 */
public class InsertionSorter {
    public static void main(String[] args) {
        int[] array = {6,7,3,2,1,7};
        sort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void sort(int[] arr) {
        for (int k = 1; k < arr.length; k++) {
            int newElement = arr[k];
            if (newElement > arr[k - 1]) continue;
            int index = Arrays.binarySearch(arr, 0, k, newElement);
            if (index < 0) {
                index = -(index) - 1;
            }
            System.arraycopy(arr, index, arr, index + 1, k - index);
            arr[index] = newElement;
        }
    }
}