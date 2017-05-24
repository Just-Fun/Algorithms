package ua.com.serzh.practice;

/**
 * Created by Sergey on 5/24/17.
 */
public class SumOfDigits {
    public static void main(String[] args) {

        System.out.println(2 / 10);
        System.out.println(2 % 10);
        System.out.println(sum(31));
        System.out.println(sum(3));
        System.out.println(sum(0));
        System.out.println(sum(111));

        System.out.println(sum2(31));
        System.out.println(sum2(3));
        System.out.println(sum2(0));
        System.out.println(sum2(111));
    }

    public static int sumRecurs(int n) {
        return n == 0 ? 0 : n % 10 + sum(n / 10);
    }

    public static int sum(int num) {
        String string = Integer.toString(num);
        String[] split = string.split("");
        if (split.length < 2) {
            return num;
        }
        int result = 0;
        for (String s : split) {
            result += Integer.parseInt(s);
        }
        return result;
    }

    public static int sum2(int num) {
        int result = 0;
        while (num > 9) {
            int left = num % 10;
            result += left;
            num = num / 10;
        }
        result += num;
        return result;
    }


}
