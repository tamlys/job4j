package ru.job4j.condition;
/**
 * MultiMax
 * @author Sachenkov Maxim(oqiwhite1996@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class MultiMax {
    /**
     * Сравниваем значения переменных
     * @param first первое значение переменной
     * @param second второе значение переменной
     * @param third третье значение переменной
     * @return возращаем самое большое значение
     */
    public int max(int first, int second, int third) {
        int result = first > second ? first : second;
        result = result > third ? result : third;
        return result;
    }
}
