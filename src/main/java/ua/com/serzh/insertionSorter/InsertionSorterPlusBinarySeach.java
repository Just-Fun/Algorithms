package ua.com.serzh.insertionSorter;

import java.util.Arrays;

/**
 * Created by Oleg on 11/26/2015.
 */
public class InsertionSorterPlusBinarySeach {
    public static void main(String[] args) {
        int[] array = {6, 3, 7};
        InsertionSorterPlusBinarySeach.sort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void sort(int[] arr) {
        int[] arrCopy = new int[arr.length];
        for (int k = 1; k < arr.length; k++) {
            int newElement = arr[k];
            int low = 0;
            int high = k - 1;
            int mid = 0;
            while (low <= high) {
                mid = (low + high) / 2;
                if (arr[mid] > newElement) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }

            if (arr[mid] < newElement) {
                mid++;
            }
            System.arraycopy(arr, mid, arrCopy, mid + 1, k - mid);
            arrCopy[mid] = arr[k];
            System.arraycopy(arrCopy, mid, arr, mid, k - mid + 1);
        }
    }
}