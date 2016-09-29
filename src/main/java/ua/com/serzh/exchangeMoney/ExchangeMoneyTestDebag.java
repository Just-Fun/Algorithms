package ua.com.serzh.exchangeMoney;

/**
 * Created by serzh on 11/30/15.
 * <p>
 * Номинал мелких монет - 1,2,5,10,25,50.
 * 1 копейку можно разменять 1 разным способом - {1}
 * 2 - двумя разными способами {1 + 1; 2}
 * 5 - 4 {1 + 1 + 1 + 1 + 1; 1 + 1 + 1 + 2; 1 + 2 + 2; 5}
 * ........
 * Сколькими разными способами можно разменятьгривну (100 монет) ?
 * <p>
 * Реализовать алгоритм подсчета колличества разных разменов для входящего параметра
 */
public class ExchangeMoneyTestDebag {
    static int count = 0;
    static boolean f = false; // проверили ил все "5"
    static boolean t = false;
    static boolean o = false;

    public static void main(String[] args) {
        System.out.println(ExchangeMoneyTestDebag.exchangeAmountOfCoinsBrutForce(2));

    }

    public static int exchangeAmountOfCoinsBrutForce(int amountForExchange) {
        if (amountForExchange < 1) {
            return 0;
        }

        if (amountForExchange >= 5 && !f) {
            five(amountForExchange);
        }

        if (amountForExchange >= 2 && !t) {
            two(amountForExchange);
        }

        if (amountForExchange >= 1) {
            one(amountForExchange);
        }
        return count;
    }

    private static void five(int amountForExchange) {
        if (amountForExchange - 5 == 0) {
            count++;
            f = true;
//            exchangeAmountOfCoinsBrutForce(amountForExchange);
        } else {
            exchangeAmountOfCoinsBrutForce(amountForExchange - 5);
        }
    }

    private static void two(int amountForExchange) {
        if (amountForExchange - 2 == 0) {
            count++;
            t = true;
            exchangeAmountOfCoinsBrutForce(amountForExchange);
        } else if (amountForExchange - 2 < 2) {
            t = true;
            exchangeAmountOfCoinsBrutForce(amountForExchange - 2);
        } else if(amountForExchange - 2 >= 2) { //потом убрать
            exchangeAmountOfCoinsBrutForce(amountForExchange - 2);
        }
    }


    private static void one(int amountForExchange) {
        if (amountForExchange - 1 == 0) {
            count++;
            o = true;
            exchangeAmountOfCoinsBrutForce(amountForExchange - 1);
        } else {
            exchangeAmountOfCoinsBrutForce(amountForExchange - 1);
        }
    }

}

//        return (amountForExchange - 2) == 0 ? 0 : exchangeAmountOfCoinsBrutForce(amountForExchange - 2);

 /*if (amountForExchange >= 50) {
            fifty(amountForExchange);
        }
        if (amountForExchange >= 25) {
            twenty(amountForExchange);
        }*/

  /*private static int fifty(int amountForExchange) {
        count++;
        return (amountForExchange - 50) == 0 ? 0 : exchangeAmountOfCoinsBrutForce(amountForExchange - 50);
    }

    private static int twenty(int amountForExchange) {
        count++;
        return (amountForExchange - 25) == 0 ? 0 : exchangeAmountOfCoinsBrutForce(amountForExchange - 25);
    }*/