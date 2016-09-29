package ua.com.serzh.mergeSorter;

import java.util.Arrays;

/**
 * Created by serzh on 11/30/15.
 */
public class MergeSorter {
    static int count = 0;

    public static void main(String[] args) {
        int[] test = {3, 1, 8, 34, 6, 1}; // start = 0, end = 4;
        int[] ans = MergeSorter.sort(test);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] sort(int[] array) {
        mergeSort(array, 0, array.length - 1);
        return array;
    }

    private static void mergeSort(int[] array, int start, int end) {
        count++;
        System.out.println("mergeSort№: " + count);
        if (end - start < 1) {
            System.out.println("return mergeSort№: " + count);
            return;
        }

        int middle = (start + end) / 2;
        System.out.println("middle: " + middle);

        System.out.println();
        System.out.printf("mergeSort(array %s, start: %s, middle: %s \n", Arrays.toString(Arrays.copyOfRange(array,start,middle + 1)), start, middle);
        mergeSort(array, start, middle);

        System.out.println();
        System.out.printf("mergeSort(array %s, middle + 1: %s, end: %s \n", Arrays.toString(Arrays.copyOfRange(array,middle + 1, end + 1)), middle + 1, end);
        mergeSort(array, middle + 1, end);

        System.out.println();
        System.out.printf("mergeArray(array %s, start: %s, middle: %s, end: %s \n", Arrays.toString(Arrays.copyOfRange(array,start, end + 1)), start, middle, end);
        mergeArray(array, start, middle, end);
//        count--;
    }

    private static void mergeArray(int[] array, int start, int middle, int end) {
        int[] buffer = new int[end - start + 1];
        int i = start;
        int j = middle + 1;
        for (int k = start; k <= end; k++) {
            if (j > end || (i <= middle && array[i] <= array[j])) {
                buffer[k - start] = array[i++];
            } else {
                buffer[k - start] = array[j++];
            }
        }
        for (int k = start; k <= end; k++) {
            array[k] = buffer[k - start];
        }
    }
}
