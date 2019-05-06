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
    int result = 0;
    public int calc(int n) {
        if (n > 0) {
            for (int i = 0; i <= n; i++) {
                if (i == 0) {
                    result = 1;
                    i++;
                }
                result = result * i;
            }
        }
        if (n == 0) {
            result = 1;
        }
        return result;
    }
}