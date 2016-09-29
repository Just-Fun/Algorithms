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
public class HanoiSolver {

    public static void main(String[] args) {
        Stack from = new Stack();
        from.add(3);
        from.add(2);
        from.add(1);
//        System.out.println(from);
        Stack help = new Stack();
        Stack to = new Stack();
        int count = 3;

        HanoiSolver.exchange(from, help, to, count);
    }

    public static void exchange(Stack from, Stack help, Stack to, int count) {
        System.out.println("from: " + from);
        System.out.println("help: " + help);
        System.out.println("to: " + to);
        if (count > 0) {
            exchange( from,to,help,count - 1);
            Object biggest = from.pop();
            to.push(biggest);
            exchange( from,help,to,count - 1);
        }
        System.out.println("after if, from: " + from);
        System.out.println("after if, help: " + help);
        System.out.println("after if, to: " + to);
    }
}
