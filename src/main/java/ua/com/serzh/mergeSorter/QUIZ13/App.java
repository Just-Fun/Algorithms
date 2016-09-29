package ua.com.serzh.mergeSorter.QUIZ13;

/**
 * Created by serzh on 11/30/15.
 */
public class App {
    public static void main(String[] args) {
        System.out.println(f0(5));
    }

    private static boolean f0(int k) {
        System.out.print("f0 ");
        return k % 3 == 0 || f2(k + 1);
    }

    private static boolean f1(int k) {
        System.out.print("f1 ");
        return k % 3 == 1 || f0(k + 1);
    }

    private static boolean f2(int k) {
        System.out.print("f2 ");
        return k % 3 == 2 || f1(k + 1);
    }
}
