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
public class ExchangeMoneyTest {
    /*static int one = 1;
    static int two = 2;
    static int five = 5;*/
    static int count = 0;
    static boolean f = false; // проверили ил все "5"
    static boolean t = false;
    static boolean o = false;

    public static void main(String[] args) {
        System.out.println(ExchangeMoneyTest.exchangeAmountOfCoinsBrutForce(5));

    }

    public static int exchangeAmountOfCoinsBrutForce(int amountForExchange) {
        if (amountForExchange < 1) {
            System.out.println("return count at begin " + count);
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
        System.out.println("five");
        if (amountForExchange - 5 == 0) {
            count++;
            System.out.println("five if, amount:" + amountForExchange + " count = " + count);
            System.out.println();
            f = true;
            exchangeAmountOfCoinsBrutForce(amountForExchange);
        } else {
            System.out.println("five else, amount:" + amountForExchange + " count = " + count );
            System.out.println();
            exchangeAmountOfCoinsBrutForce(amountForExchange - 5);
        }
    }

    private static void two(int amountForExchange) {
        System.out.println("two, amount:" + amountForExchange + " count = " + count);
        if (amountForExchange - 2 == 0) {
            System.out.println("two if, amount:" + amountForExchange + " count = " + count);
            System.out.println();
            count++;
            t = true;
            exchangeAmountOfCoinsBrutForce(amountForExchange);
        } else if (amountForExchange - 2 < 2) {
            System.out.println("two else if, amount = " + amountForExchange);
            System.out.println();
            t = true;
            exchangeAmountOfCoinsBrutForce(amountForExchange - 2);
        } else if(amountForExchange >= 2) { //потом убрать
            System.out.println("two else..., amount = " + amountForExchange + " count = " + count);
            System.out.println();
            exchangeAmountOfCoinsBrutForce(amountForExchange - 2);
        }
    }


    private static void one(int amountForExchange) {
        System.out.println("one, amount: " + amountForExchange + " count = " + count);
        if (amountForExchange - 1 == 0) {
            count++;
            System.out.println("one if, count = " + count);
            System.out.println();
            o = true;
            exchangeAmountOfCoinsBrutForce(amountForExchange - 1);
        } else {
            System.out.println("one else, amount = " + amountForExchange);
            System.out.println();
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