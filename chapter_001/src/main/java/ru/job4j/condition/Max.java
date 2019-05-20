package ru.job4j.condition;
/**
 * Max
 * @author Sachenkov Maxim(oqiwhite1996@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Max {
    /**
     * Метод max
     * @param first первое значение
     * @param second второе значение
     * @return большее значение
     */
    public int max(int first, int second) {
        return first > second ? first : second;
    }
    /**
     * Метод max
     * @param first первое значение
     * @param second второе значение
     * @param third третье значение
     * @return большее значение
     */
    public int max(int first, int second, int third) {
        int tmp = first > second ? first : second;
        return tmp > third ? tmp : third;
    }
    /**
     * Метод max
     * @param first первое значение
     * @param second второе значение
     * @param third третье значение
     * @param fourth четвертое значение
     * @return большее значение
     */
    public int max(int first, int second, int third, int fourth) {
        int tmp = first > second ? first : second;
        int tmpOne = tmp > third ? tmp : third;
        return tmpOne > fourth ? tmpOne : fourth;
    }
}