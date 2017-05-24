package ua.com.serzh;

/**
 * Created by serzh on 2/16/16.
 */
public class Factorial {
    public static void main(String[] args) {

        int num = 0;
        int result = factorial(num);
//        int result = factorRecurs(num);
        System.out.println(result);
    }

    private static int factorial(int num) {
        int fact = 1;

//        for (; num > 0; fact *= num--) ;
        while (num > 0) {
            fact *= num--;
        }

        return fact;
    }

    private static int factorRecurs(int num) {
        return (num == 0) ? 1 : num * factorRecurs(num - 1);
    }

    static int factorRecurs2(int num) {
        if (num == 1) {
            return 1;
        }
        return num * factorial(num - 1);
    }

}
