package ua.com.serzh.sortingDismantle;

/**
 * Created by Serzh on 9/15/16.
 */
public class Quicksort2 {
    public static void sort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    static void quickSort(int arr[], int left, int right) {
        int index = partition(arr, left, right);
        if (left < index - 1)
            quickSort(arr, left, index - 1);
        if (index < right)
            quickSort(arr, index, right);
    }

    static int partition(int arr[], int left, int right) {
        int tmp;
        int middle = (left + right) / 2;
        int pivot = arr[middle];

        while (left <= right) {
            while (arr[left] < pivot)
                left++;
            while (arr[right] > pivot)
                right--;
            if (left <= right) {
                tmp = arr[left];
                arr[left] = arr[right];
                arr[right] = tmp;
                left++;
                right--;
            }
        }
        return left;
    }
}
