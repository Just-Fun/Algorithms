package ua.com.serzh.exchangeMoney;

/**
 * Created by serzh on 12/3/15.
 */
public class ExchangeMoneySecond {
    static int count = 0;
    static boolean five = false;
    static boolean two = false;
    static boolean one = false;
    static boolean biggerThenZero = false;
    static boolean even = false;

    public static void main(String[] args) {
        int test = ExchangeMoneySecond.exchangeAmountOfCoinsBrutForce(2);
        System.out.println(test);

        }

    public static int exchangeAmountOfCoinsBrutForce(int amountForExchange) {
        if (amountForExchange > 0 && !biggerThenZero) {
            count++;
            biggerThenZero = true;
            if (amountForExchange == 5) {
                five = true;
                exchangeAmountOfCoinsBrutForce(5);
            }
            if (amountForExchange == 2) {
                two = true;
                exchangeAmountOfCoinsBrutForce(2);
            }
            if (amountForExchange == 1) return  1;
        }
        if (amountForExchange > 10 && amountForExchange % 2 == 0 && !even) {
            count++;
            even = true;
        }
        if (amountForExchange == 5 && !five) {
            count++;
            five = true;
            exchangeAmountOfCoinsBrutForce(5);
        /*} else if (amountForExchange > 5) {
            five = false;
            exchangeAmountOfCoinsBrutForce(amountForExchange - 5);
            exchangeAmountOfCoinsBrutForce(5);*/
        } else if (amountForExchange == 2 && !two) {
            count++;
//            count++;
//            two = true;
//            exchangeAmountOfCoinsBrutForce(amountForExchange);
        } else if (amountForExchange == 2 && two) {
            count++;
        }
        else if (amountForExchange > 2) {
            two = false;
            exchangeAmountOfCoinsBrutForce(amountForExchange - 2);
            exchangeAmountOfCoinsBrutForce(2);
        } else  if (amountForExchange == 1) {
            count++;
        }


        return count;
    }
}
