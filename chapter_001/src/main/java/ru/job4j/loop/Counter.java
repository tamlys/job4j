package ru.job4j.loop;
/**
 * Counter
 * @author Sachenkov Maxim (oqiwhite1996@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Counter {
    /**
     *
     * @param start начальное значение
     * @param finish конечное значение
     * @return sum возвращаем сумму четных чисел
     */
    public int add(int start, int finish) {
        int sum = 0;
        for (int i = start; i <= finish; i++) {
            if (i % 2 == 0) {
                sum = i + sum;
            }
        }
        return sum;
    }
}

