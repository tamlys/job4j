package ru.job4j.loop;
/**
 * Factorial
 * @author Maxim Sachenkov (oqiwhite1996@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Factorial {
    /**
     * calc вычисляем факториал числа n
     * result окончательный результат
     */
    public int calc(int n) {
        int result = 1;
        if (n > 0) {
            for (int i = 1; i <= n; i++) {
                result = result * i;
            }
        }
        if (n == 0) {
            return result;
        }
        return result;
    }
}