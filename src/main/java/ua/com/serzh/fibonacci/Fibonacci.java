package ua.com.serzh.fibonacci;

/**
 * Created by Serzh on 9/1/16.
 */
public class Fibonacci {
    public static void main(String[] args) {

        for (int counter = 0; counter <= 10; counter++)
//            System.out.printf("Fibonacci of %d is: %d\n", counter, fibonacci(counter));
            System.out.printf("Fibonacci of %d is: %d\n", counter, fibonacci2(counter));

    }

    public static long fibonacci(long number) {
        if ((number == 0) || (number == 1))
            return number;
        else
            // recursion step
            return fibonacci(number - 1) + fibonacci(number - 2);
    }

    private static int fibonacci2(int n) {
        return n < 2 ? n : fibonacci2(n - 1) + fibonacci2(n - 2);
    }
}
