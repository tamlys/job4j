package ru.job4j.loop;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * BoardTest
 * @author Sachenkov Maxim (oqiwhite1996@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class BoardTest {
    /**
     * method when3x3
     * Проверяет заполнение шахматной доски 3x3
     */
    @Test
    public void whenPaintBoardWithWidthThreeAndHeightThreeThenStringWithThreeColsAndThreeRows() {
        Board board = new Board();
        String result = board.paint(3, 3);
        final String line = System.getProperty("line.separator");
        String expected = String.format("X_X%s_X_%sX_X%s", line, line, line);
        assertThat(result, is(expected));
    }
    /**
     * method when3x3
     * Проверяет заполнение шахматной доски 5x4
     */
    @Test
    public void whenPaintBoardWithWidthFiveAndHeightFourThenStringWithFiveColsAndFourRows() {
        //напишите здесь тест, проверяющий формирование доски 5 на 4.
        Board board = new Board();
        String result = board.paint(5, 4);
        final String line = System.getProperty("line.separator");
        String expected = String.format("X_X_X%s_X_X_%sX_X_X%s_X_X_%s", line, line, line, line);
        assertThat(result, is(expected));
    }
}