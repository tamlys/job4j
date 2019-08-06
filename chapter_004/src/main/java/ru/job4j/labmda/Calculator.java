package ru.job4j.labmda;
import java.util.function.BiFunction;
import java.util.function.Consumer;
/**
 * Calculator
 * @author Sachenkov Maxim (oqiwhite1996@gmail.com)
 * @version $Id$
 * @since 06.08.19
 */
public class Calculator {
    /**
     * Интерфейс описывающий функцию, которая принимает два параметра left и right
     */
    public interface Operation {
        double calc(int left, int right);
    }
    /**
     * Метод Multiple
     * @param start начальное значение
     * @param finish окончательное значение
     * @param value результат
     * @param op это функция, принимает два параметра и возвращает значение
     * @param media это функция, принимает значение и ничего не возвращает
     */
    public void multiple(int start, int finish, int value,
                         BiFunction<Integer, Integer, Double> op,
                         Consumer<Double> media) {
        for (int index = start; index != finish; index++) {
            media.accept(op.apply(value, index));
        }
    }
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.multiple(
                0, 10, 2,
                (value, index) -> {
                    double result = value * index;
                    System.out.printf("Multiple %s * %s = %s %n", value, index, result);
                    return result;
                },
                result -> System.out.println(result)
        );
    }
}
