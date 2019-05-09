package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
/**
 * @author Sachenkov Maxim (oqiwhite1996@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class TurnTest {
    /**
     * whenTurnArrayWithEvenAmountOfElementsThenTurnedArray
     * Получает массив 4, 1, 6, 2 и переворачивает значения, чтобы на выходе получилось 2, 6, 1, 4
     */
    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        Turn turner = new Turn();
        int[] input = new int[] {4, 1, 6, 2};
        int[] result = turner.back(input);
        int[] expect = new int[] {2, 6, 1, 4};
        assertThat(result, is(expect));
    }
    /**
     * whenTurnArrayWithOddAmountOfElementsThenTurnedArray
     * Получает массив 1, 2, 3, 4, 5 и переворачивает значения, чтобы на выходе получилось 5, 4, 3, 2, 1
     */
    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        Turn turner = new Turn();
        int[] input = new int[] {1, 2, 3, 4, 5};
        int[] result = turner.back(input);
        int[] expect = new int[] {5, 4, 3, 2, 1};
        assertThat(result, is(expect));
    }
}
