package ru.job4j.array;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Square
 * @author Maxim Sachenkov (oqiwhite1996@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class FindLoopTest {
    /**
     * whenArrayHas5Then0
     * Заполняем массив произвольными данными и ищем ячейку массива со значением 5, далее выводим индекс ячейки.
     */
    @Test
    public void whenArrayHas5Then0() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {5, 10, 3};
        int value = 5;
        int result = find.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }
    /**
     * whenArrayHas2ThenNotFound
     * Заполняем массив произвольными данными и ищем ячейку массива со значением 2, далее выводим индекс ячейки.
     * Если данного значения нет ни в одной из ячеек, выводим -1
     */
    @Test
    public void whenArrayHas2ThenNotFound() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {5, 10, 3};
        int value = 2;
        int result = find.indexOf(input, value);
        int expect = -1;
        assertThat(result, is(expect));
    }
    /**
     * whenArrayHasMinValue1
     * Заполняем массив произвольными данными и ищем ячейку массива с минимальным значением 2.
     */
    @Test
    public void whenArrayHasMinValue2() {
        FindLoop find = new FindLoop();
        int[] input = new int[]{3, 2, 5};
        int result = find.minValue(input);
        int expect = 2;
        assertThat(result, is(expect));
    }
    /**
     * whenArrayHas1Then2
     * Заполняем массив произвольными данными и ищем ячейку массива с минимальным значением 1.
     */
    @Test
    public void whenArrayHasMinValue1() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {2, 3, 1};
        int result = find.minValue(input);
        int expect = 1;
        assertThat(result, is(expect));
    }
}
