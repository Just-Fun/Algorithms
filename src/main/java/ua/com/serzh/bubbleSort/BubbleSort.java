package ua.com.serzh.bubbleSort;

import java.util.ArrayList;

/**
 * Created by serzh on 12/1/15.
 */
public class BubbleSort {

    public void sort(ArrayList data) {
        int size = data.size();
        for (int j = 0; j < size - 1; j++) {
//            for (int i = 0; i < size - j - 1; i++) {
//                /*if (data.get(i).compareTo(data.get(i+1)) > 0) {
//                    data.swap(i, i+1);*/
//            }
        }
    }

    public void sortSimple(int[] data) {
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
