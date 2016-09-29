package ua.com.serzh.sortingDismantle;

/**
 * Created by serzh on 1/5/16.
 */

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemo {
    public static void main(String args[]) {
        // create arraylist
        ArrayList<String> arlst = new ArrayList<String>();

        // populate the list
        arlst.add("TP");
        arlst.add("PROVIDES");
        arlst.add("QUALITY");
        arlst.add("TUTORIALS");

        // search the list for key 'QUALITY'
        int index = Collections.binarySearch(arlst, "QUALITY");

        System.out.println("'QUALITY' is available at index: " + index);
    }
}