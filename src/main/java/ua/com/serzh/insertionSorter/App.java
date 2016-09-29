package ua.com.serzh.insertionSorter;

import java.util.Random;

/**
 * Created by Oleg on 11/26/2015.
 */
public class App {
    public static void main(String[] args) {
        int[] array = new int[256 * 10];
        Random rnd = new Random(0);
        for (int k = 0; k < array.length; k++) {
            array[k] = rnd.nextInt();
        }
        long t1 = System.nanoTime();
        InsertionSorter.sort(array);
//        InsertionSorterPlusBinarySeach.sort(array);
        System.out.println("a1:" + (System.nanoTime() - t1) / 1_000_000);
    }
}