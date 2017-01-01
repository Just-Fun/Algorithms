package ua.com.serzh;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.apache.log4j.Logger;

import static java.lang.Integer.parseInt;

/**
 * Created by Serzh on 9/29/16.
 */
public class Temp {
    static Logger log = Logger.getLogger(Temp.class);

    public static void main(String[] args) {

        int[] ints = new int[]{5, 2, 9, 2};
        Arrays.sort(ints);
        log.info(Arrays.toString(ints)); // 2,2,5,9

        int i = binarySearch(ints, 5);
        log.info(i);
    }

    private static int binarySearch(int[] array, int num) {
        int low = 0;
        int high = array.length - 1;

        while (low < high) {
            int middle = (low + high) / 2;

            if (num == array[middle]) {
                return middle;
            }

            if (num > array[middle]) {
                low++;
            }
            if (num < array[middle]) {
                low--;
            }

        }

        return -1;
    }

}
