package ru.job4j.cash;
/**
 * cash
 * @author Sachenkov Maxim (oqiwhite1996@gmail.com)
 * @version $Id$
 * @since 0.1
 */

public class CashMachine {
    private int value;
    private int price;
    private int[] coint = {10, 5, 2, 1};
    private int[] res = new int[4];
    public int[] changes(int value, int price) {
        int returnMoney = value - price;
        int count = 0;
        for (int coin : coint) {
            while (returnMoney > 0) {
                if (returnMoney > coint[coin]) {
                    returnMoney -= coint[coin];
                    count++;
                } else {
                        res[coin] = count;
                        count = 0;
                }
            }
        }
        return res;
    }
}

