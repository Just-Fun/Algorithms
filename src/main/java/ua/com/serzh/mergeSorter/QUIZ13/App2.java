package ua.com.serzh.mergeSorter.QUIZ13;

/**
 * Created by serzh on 11/30/15.
 */
public class App2 {
    public static void main(String[] args) {
        System.out.println(f(5, 3));
    }
    public static int f(int a, int b) {
        return (b == 1) ? a : a * f(a, b - 1);
    }
}
