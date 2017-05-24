package ua.com.serzh.practice;

import java.util.Scanner;

/**
 * Created by Sergey on 5/24/17.
 */
public class ExampleSumofDigitsUsingRecursion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();

        System.out.println("Sum of digits of " + num + " is " + sum(num));
    }

    public static int sum(int n) {
        return n == 0 ? 0 : n % 10 + sum(n / 10);
    }

}
