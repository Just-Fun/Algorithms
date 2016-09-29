package ua.com.serzh.hanoi;

import java.util.Stack;

/**
 * Created by serzh on 11/27/15.
 */

/*
Stack структура данных, которая хранит множество элементов и реализует принцип
LIFO (last in first out) - последний пришел, первый ушел.
Тоесть, когда мы просим стэк отдать элемент методом pop(), он возвращает последний добавленный элемент.
Также эта структура данных известна как магазин. Метод push() добавляет элемент в начало стэка.
 */
public class HanoiSolverTest {
    static int countEx = 0;
    public static void main(String[] args) {
        Stack from = new Stack();
        from.add(3);
        from.add(2);
        from.add(1);
        System.out.println(from);

        Stack help = new Stack();
        Stack to = new Stack();
        int count = 3;

        /*int temp = (int) from.pop();
        System.out.println(temp);
        to.push(temp);
        System.out.println(to);
        System.out.println(from);*/

        HanoiSolverTest.exchange(from, help, to, count);
    }

    public static void exchange(Stack from, Stack help, Stack to, int count) {
        countEx++;
        System.out.print("Ex№ " + countEx + ",  ");
        System.out.println("count: " + count);
        System.out.print("from: " + from + ",  ");
        System.out.print("help: " + help + ",  ");
        System.out.println("to: " + to);
        if (count > 0) {
            exchange(from, to, help, count - 1);
            Object biggest = from.pop();
            System.out.println("biggest: " + biggest + " in Ex№ " + countEx);
            to.push(biggest);
            System.out.println("from: " + from + ",  " + "to: " + to);
            exchange(from, help, to, count - 1);
        }
        System.out.println("after if, from: " + from);
        System.out.println("after if, help: " + help);
        System.out.println("after if, to: " + to);
        countEx--;
    }
}
