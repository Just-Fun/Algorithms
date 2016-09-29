package ua.com.serzh.insertionSorter;

import java.util.Arrays;

/**
 * Created by serzh on 1/7/16.
 */
public class Main {

    public static void main(String[] args) {

        int[] arr = {1, 5, 3, 7};
        int[] arrCopy = new int[4];
        int mid = 1;
        int i = 2;
        System.arraycopy(arr, mid, arrCopy, mid + 1, i - mid);
        arrCopy[mid] = arr[i];
        System.arraycopy(arrCopy, mid, arr, mid, i - mid + 1);
        System.out.println(Arrays.toString(arr));
    }
}
