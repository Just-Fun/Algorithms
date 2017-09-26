package ua.com.serzh.fibonacci;

/**
 * Created by Serzh on 9/1/16.
 */
public class Fibonacci {
    public static void main(String[] args) {
//        int[] f = fib(7);
//        System.out.println(Arrays.toString(f));
        for (int counter = 0; counter < 11; counter++) {
//            System.out.printf("Fibonacci of %d is: %d\n", counter, fibonacci(counter));
//            System.out.printf("Fibonacci of %d is: %d\n", counter, fibonacci2(counter));
            System.out.printf("Fibonacci of %d is: %d\n", counter, fibSimple(counter));
        }
    }

    public static int fibonacci(int number) {
//        rebase temp
        if ((number < 2)) {
            return number;
        } else {
            return fibonacci(number - 1) + fibonacci(number - 2);
        }
    }

    private static int fibonacci2(int n) {
        return n < 2 ? n : fibonacci2(n - 1) + fibonacci2(n - 2);
    }

    private static int fibSimple(int num) {
        int first = 0;
        int next = 1;
        for (int i = 0; i < num; i++) {
            int temp = next;
            next = first + next;
            first = temp;
        }
        return first;
    }

    private static int[] fib(int num) {
        int[] result = new int[num];
        int prev = 0;
        int next = 1;
        for (int i = 0; i < num; i++) {
            result[i] = prev;
            int temp = next;
            next = prev + next;
            prev = temp;
        }
        return result;
    }
}
