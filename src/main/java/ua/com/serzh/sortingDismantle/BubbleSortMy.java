package ua.com.serzh.sortingDismantle;

import java.util.Arrays;

/**
 * Created by serzh on 1/7/16.
 */
public class BubbleSortMy {

    public static void main(String[] args) {

        int[] temp = {7, 2, 5, 3, 4, 6, 2};
        bubbleSort(temp);
        System.out.println(Arrays.toString(temp));
    }

    private static int[] bubbleSort(int[] array) {

        int size = array.length;
        for (int j = 0; j < size; j++) {
            for (int i = 0; i < size - 1 - j; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
        return array;
    }
}
