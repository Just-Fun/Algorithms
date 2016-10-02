package ua.com.serzh.sortingDismantle;

/**
 * Created by serzh on 2/16/16.
 */
public class Factorial {
    public static void main(String[] args) {

        System.out.println(factorial(5));
    }

    static int factorial(int num) {
        if (num == 1) {
            return 1;
        }
        return num * factorial(num - 1);
    }

    static int factorial2(int n) {
        return (n == 1) ? n : n * factorial2(n - 1);
    }
}
