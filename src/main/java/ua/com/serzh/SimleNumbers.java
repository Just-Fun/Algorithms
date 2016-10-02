package ua.com.serzh;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Serzh on 10/1/16.
 */
public class SimleNumbers {
    public static void main(String[] args) {
        List<Integer> integers = run(100);
        for (Integer integer : integers) {
            System.out.print(integer + " ");
        }
    }

    private static List<Integer> run(int max)    {
        List<Integer> simpleIntegers = new LinkedList<>(Arrays.asList(1, 2));
        for (int i = 3; i <= max; i++) {
            boolean simle = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0)
                    simle = false;
            }
            if (simle) {
                simpleIntegers.add(i);
            }
        }
        return simpleIntegers;
    }
}
