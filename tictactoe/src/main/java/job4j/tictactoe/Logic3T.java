package job4j.tictactoe;
import java.util.function.Predicate;
/**
 * Logic3T
 * @author Sachenkov Maxim (oqiwhite1996@gmail.com)
 * @version $Id$
 * @since 14.08.19
 */
public class Logic3T {
    private final Figure3T[][] table;
    public Logic3T(Figure3T[][] table) {
        this.table = table;
    }
    /**
     * Метод boolean fillBy
     * @param predicate Ссылка на метод, имеется ли в ячейке X или O
     * @param startX начальное значение X
     * @param startY начальное значение Y
     * @param deltaX приращение X
     * @param deltaY приращение Y
     * @return true, если на одной последовательности X или O(в зависимости от переданного predicate)
     */
    public boolean fillBy(Predicate<Figure3T> predicate, int startX, int startY, int deltaX, int deltaY) {
        boolean result = true;
        for (int index = 0; index != this.table.length; index++) {
            Figure3T cell = this.table[startX][startY];
            startX += deltaX;
            startY += deltaY;
            if (!predicate.test(cell)) {
                result = false;
                break;
            }
        }
        return result;
    }
    /**
     * Метод boolean isWinner
     * @param predicate Ссылка на метод, имеется ли в ячейке X или O
     * @return true, если выиграл X или O(в зависимости от переданного predicate)
     */
    private boolean isWinner(Predicate<Figure3T> predicate) {
        boolean horizontal = false,
                vertical = false,
                diagonal = false;
        for (int i = 0; i < table.length; i++) {
            if (this.fillBy(predicate, 0, i, 1, 0)) {
                horizontal = true;
                break;
            }
        }
        for (int i = 0; i < table.length; i++) {
            if (this.fillBy(predicate, i, 0, 0, 1)) {
                vertical = true;
                break;
            }
        }
        if (!(horizontal || vertical)) {
            diagonal = this.fillBy(predicate, 0, 0, 1, 1)
                    || this.fillBy(predicate, this.table.length - 1, 0, -1, 1);
        }
        return horizontal || vertical || diagonal;
    }
    /**
     * boolean isWinnerX
     * @return true, если выиграл
     */
    public boolean isWinnerX() {
        return isWinner(Figure3T::hasMarkX);
    }
    /**
     * boolean isWinnerO
     * @return true, если выиграл
     */
    public boolean isWinnerO() {
        return isWinner(Figure3T::hasMarkO);
    }
    /**
     * boolean hasGap
     * @return true, если есть свободные ячейки для ходов
     */
    public boolean hasGap() {
        int cells = table.length * table[0].length;
        int counter = 0;
        boolean result = true;
        for (Figure3T[] str : table) {
            for (Figure3T cell : str) {
                if (cell.hasMarkO() || cell.hasMarkX()) {
                    counter++;
                }
            }
            if (counter == cells) {
                result = false;
            }
        }
        return result;
    }
}
