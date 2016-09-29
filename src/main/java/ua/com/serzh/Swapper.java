package ua.com.serzh;

/**
 * Created by Serzh on 9/29/16.
 */
public class Swapper {
    public static <T> void swap(T[] a, int i, int j) {
        T temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
