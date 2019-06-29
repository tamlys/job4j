package ru.job4j.cash;
import java.util.Arrays;
/**
 * cash
 * @author Sachenkov Maxim (oqiwhite1996@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class CashMachine {
    private int[] coint = {1, 2, 5, 10};
    int[] changes(int value, int price) {
        int[] result = new int[100];
        int returnMoney = value - price;
        int maxCoin = coint[coint.length - 1];
        int count = 0;
        for (int i = 0; returnMoney != 0;) {
                if (returnMoney >= maxCoin) {
                    result[i++] = maxCoin;
                    returnMoney = returnMoney - maxCoin;
                    count++;
                } else {
                    maxCoin--;
                }
        }
        return Arrays.copyOf(result, count);
    }
}

