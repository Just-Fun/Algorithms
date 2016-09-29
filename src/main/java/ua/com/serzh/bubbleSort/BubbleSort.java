package ua.com.serzh.bubbleSort;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by serzh on 12/1/15.
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] array = new int[]{3, 5, 1, 9};

//        int[] arrSort  = sort(array);
//        System.out.println(Arrays.toString(arrSort));
        sort(array);
        System.out.println(Arrays.toString(array));
//        sortSimple(array);
//        System.out.println(Arrays.toString(array));
    }

    private static void sort(int[] array) {
        int length = array.length;

        for (int i = 0; i < length; i++) {
            for (int j = length - 1; j > i; j--) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    /*public static void sort(ArrayList data) {
        int size = data.size();
        for (int j = 0; j < size - 1; j++) {
            for (int i = 0; i < size - j - 1; i++) {
                if (data.get(i).compareTo(data.get(i + 1)) > 0) {
                    data.swap(i, i + 1);
                }
            }
        }
    }*/

    public static void sortSimple(int[] data) {
        int size = data.length;
        for (int j = 0; j < size - 1; j++) { // O(n)
            for (int i = 0; i < size - j - 1; i++) { // O(n/2)
                if (data[i] > data[i + 1]) { // = O(n^2)
                    int temp = data[i];
                    data[i] = data[i + 1];
                    data[i + 1] = temp;
                }
            }
        }
    }
}
