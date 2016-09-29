package ua.com.serzh.sortingDismantle;

import java.util.Arrays;

/**
 * Created by serzh on 11/25/15.
 */
public class SelectionSorter {
    public static void main(String[] args) {
        int[] ans = {3, 4, 6, 1, 3};
        //arrays.sort(ans);
        SelectionSorter.sort(ans);
//        System.out.println(arrays.toString(ans));
        System.out.println(Arrays.toString(ans));
        System.out.println("Changed!");
        System.out.println("Changed on GitHub!");
    }


    public static void sort(int[] arr) {
        Arrays.sort(arr);
    }



    public static void sortNo(int[] arr) {
        int count = 0;
        int countFor = 0;
        int min;
        int i = 0;
        for (int barrier = 0; barrier < arr.length - 1; barrier++) {
            for (int index = barrier + 1; index < arr.length; index++) {
                countFor++;
                min = arr[barrier];
                if (min > arr[index]) {
                    System.out.println("if count: " + count);
                    min = arr[index];
                    i = index;
                    count++;
                }
                arr[i] = arr[barrier];
                arr[barrier] =  min;
            }
        }
        System.out.println("count" + count);
        System.out.println("countFor: " + countFor);
    }

    public static void sort0(int[] arr) {
       /* int count = 0;
        int countFor = 0;*/
        for (int barrier = 0; barrier < arr.length - 1; barrier++) {
            for (int index = barrier + 1; index < arr.length; index++) {
//                countFor++;
                if (arr[barrier] > arr[index]) {
//                    System.out.println("if count: " + count);
                    int tmp = arr[index];
                    arr[index] = arr[barrier];
                    arr[barrier] = tmp;
//                    count++;
                }
            }
        }
//        System.out.println("count" + count);
//        System.out.println("countFor: " + countFor);
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

    public static void sort1(int[] arr) {
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