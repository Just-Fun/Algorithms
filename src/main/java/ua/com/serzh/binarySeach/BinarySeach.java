package ua.com.serzh.binarySeach;


import java.util.Arrays;

/**
 * Created by serzh on 1/5/16.
 */
public class BinarySeach {
    static int result = -1;

    public static void main(String[] args) {

        int[][] temp = {{3, 4}, {1, 2, 3, 4, 6}};
        int[][] temp2 = {{3, 4}, {1, 2, 3, 4, 6}};
//        int ans = binarySearch1(temp, 0, 4, 6);
//        int ans = binarySearch2(temp, 5);
        int[] array = {3, 4};
        int[] array1 = new int[2];
        System.arraycopy(array, 1, array1, 0, 1);
        System.out.println(Arrays.toString(array1));
//        System.out.println(arrays.deepToString(temp));
//        System.out.println(arrays.deepEquals(temp, temp2));

//        System.out.println(ans);
    }

    private static int binarySearch2(int[] list, int value) {

        int low = 0;
        int high = list.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (list[mid] == value) {
                return mid;
            } else if (list[mid] < value) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    private static int binarySearch(int[] arr, int num) {
        return seach(arr, 0, arr.length - 1, num);
    }

    private static int seach(int[] arr, int from, int till, int num) {
        if (till < 0 || from > arr.length - 1) return result = -1;

        if (from == till) result = from;
        int mid = (from + till) / 2;
        if (arr[mid] == num) {
            return result = mid;
        } else if (num < arr[mid]) {
            seach(arr, from, mid - 1, num);
        } else if (num > arr[mid]) {
            seach(arr, mid + 1, till, num);
        }
        return result;
    }

    private static int binarySearch1(int[] list, int begin, int end, int query) {

        if (begin > end)
            return -1;
        int middle = (begin + end) / 2;
        if (list[middle] == query) {
            return middle;
        }
        if (list[middle] < query) {
            return binarySearch1(list, begin, middle, query);
        }
        return binarySearch1(list, middle, end, query);
    }


}
