package ua.com.serzh.exchangeMoney;

/**
 * Created by serzh on 11/30/15.
 *
    Номинал мелких монет - 1,2,5,10,25,50.
    1 копейку можно разменять 1 разным способом - {1}
    2 - двумя разными способами {1 + 1; 2}
    5 - 4 {1 + 1 + 1 + 1 + 1; 1 + 1 + 1 + 2; 1 + 2 + 2; 5}
    ........
    Сколькими разными способами можно разменятьгривну (100 монет) ?

    Реализовать алгоритм подсчета колличества разных разменов для входящего параметра
 */
public class ExchangeMoney {
    static int one = 1;
    static int two = 2;
    static int five = 5;
    static int ten = 10;
    static int twentyFive = 25;
    static int fifty = 50;

    public static void main(String[] args) {

    }
    public static int exchangeAmountOfCoinsBrutForce(int amountForExchange) {
        int count = 0;


        return 1;
    }
}
