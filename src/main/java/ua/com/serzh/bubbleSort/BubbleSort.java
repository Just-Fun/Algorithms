package ua.com.serzh.bubbleSort;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static java.util.Collections.swap;

/**
 * Created by serzh on 12/1/15.
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] array = new int[]{3, 5, 1, 9};

        sort(array);
        System.out.println(Arrays.toString(array));

        List<String> list = new LinkedList<>();
        list.add("d");
        list.add("a");
        list.add("s");
        list.add("w");
        sortList(list);
        System.out.println(list);

    }

    private static void sort(int[] array) {
        int length = array.length;
        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j < length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    private static void sort2(int[] array) {
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

    public static void sortList(List<String> data) {
        int size = data.size();
        for (int j = 0; j < size - 1; j++) {
            for (int i = 0; i < size - j - 1; i++) {
                if (data.get(i).compareTo(data.get(i + 1)) > 0) {
                    swap(data, i, i + 1);
                }
            }
        }
    }
}
