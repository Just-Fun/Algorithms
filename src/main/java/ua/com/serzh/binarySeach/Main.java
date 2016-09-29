package ua.com.serzh.binarySeach;

/**
 * Created by serzh on 14.02.16.
 */
public class Main {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 7};

        System.out.println(f(array, 4));
    }

    static int f(int[] array, int x) {
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {
            int mid = (low + high) >>> 1; // equals int mid = (low + high) / 2 ?;
            int midVal = array[mid];
            if (midVal < x)
                low = mid + 1;
            else if (midVal > x)
                high = mid - 1;
            else
                return mid;
        }
        return -1;
    }
}
