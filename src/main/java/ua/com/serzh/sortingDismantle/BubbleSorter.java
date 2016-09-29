package ua.com.serzh.sortingDismantle;

import java.util.Arrays;

/**
 * Created by Oleg on 11/23/2015.
 */
public class BubbleSorter {
    public static void main(String[] args) {
        int[] ans = {3, 1, 6, 4, 3};
        BubbleSorter.selectSort(ans);
//        System.out.println(arrays.toString(ans));
    }

    public static void selectSort(int[] arr) {
        for (int barrier = 0; barrier < arr.length - 1; barrier++) {
            for (int index = barrier + 1; index < arr.length; index++) {
                if (arr[barrier] > arr[index]) {
                    int temp = arr[index];
                    arr[index] = arr[barrier];
                    arr[barrier] = temp;
                }
            }
            System.out.println(Arrays.toString(arr));
        }
    }

    public static void insertSort(int[] arr) {
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

    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length - 1; j >= 1; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }

    }

    public static void sortBig(int[] arr) {
        for (int barrier = arr.length - 1; barrier >= 0; barrier--) {
            for (int index = 0; index < barrier; index++) {
                if (arr[index] > arr[index + 1]) {
                    int tmp = arr[index];
                    arr[index] = arr[index + 1];
                    arr[index + 1] = tmp;
                }
            }
        }
    }
}
