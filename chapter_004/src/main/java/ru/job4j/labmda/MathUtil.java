package ru.job4j.labmda;
/**
 * MathUtil
 * @author Sachenkov Maxim (oqiwhite1996@gmail.com)
 * @version $Id$
 * @since 06.08.19
 */
public class MathUtil {
    /**
     * Статический метод сложения, который принимает два параметра left и right и возвращает результат
     */
    public static double add(int left, int second) {
        return left + second;
    }
    /**
     * Статический метод деления, который принимает два параметра left и right и возвращает результат
     */
    public static double div(int left, int second) {
        return left / second;
    }
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.multiple(
                0, 10, 2,
                MathUtil::add,
                result -> System.out.println(result)
        );
    }
}
