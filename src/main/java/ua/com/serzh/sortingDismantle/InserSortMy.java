package ua.com.serzh.sortingDismantle;

import java.util.Arrays;

/**
 * Created by serzh on 1/7/16.
 */
public class InserSortMy {

    public static void main(String[] args) {

        int[] temp = {7, 2, 5, 8, 1, 2};
        insertionSort(temp);
        System.out.println(Arrays.toString(temp));
    }

    public static void insertionSort(int[] arr) {
        int i, j, newValue;
        for (i = 1; i < arr.length; i++) {
            newValue = arr[i];
            j = i;
            while (j > 0 && arr[j - 1] > newValue) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = newValue;
            System.out.println(Arrays.toString(arr));

        }
    }
}
