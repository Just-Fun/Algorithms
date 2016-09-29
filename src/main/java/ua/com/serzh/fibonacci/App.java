package ua.com.serzh.fibonacci;

/**
 * Created by Oleg on 11/26/2015.
 */
public class App {
    public static void main(String[] args) {
        f(1);
    }

    private static void f(int n) {
        if (n < 7) {
            System.out.print(n);
            f(2 * n);
            System.out.print(n);
        }
    }
}
