package ru.job4j.loop;
import java.util.function.BiPredicate;
/**
 * Paint
 * @author Sachenkov Maxim (oqiwhite1996@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Paint {
    /**
     * method rightTrl
     * @param height высота пирамиды
     * @return возвращает правую сторону пирамиды размером height
     */
    public String rightTrl(int height) {
        return this.loopBy(
                height,
                height,
                (row, column) -> row >= column
        );
    }
    /**
     * method leftTrl
     * @param height высота пирамиды
     * @return возвращает левую сторону пирамиды размером height
     */
    public String leftTrl(int height) {
        return this.loopBy(
                height,
                height,
                (row, column) -> row >= height - column - 1
        );
    }
    /**
     * method pyramid
     * @param height высота пирамиды
     * @return возвращает пирамиду заданного размера
     */
    public String pyramid(int height) {
        return this.loopBy(
                height,
                2 * height - 1,
                (row, column) -> row >= height - column - 1 && row + height - 1 >= column
        );
    }
    /**
     * loopBy
     * @param height высота пирамиды
     * @param widht ширина пирамиды
     * @param predict условие проставление ^
     * @return возвращает пирамиду заданных размеров
     */
    private String loopBy(int height, int widht, BiPredicate<Integer, Integer> predict) {
        StringBuilder screen = new StringBuilder();
        for (int row = 0; row != height; row++) {
            for (int column = 0; column != widht; column++) {
                if (predict.test(row, column)) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(System.lineSeparator());
        }
        return screen.toString();
    }
}