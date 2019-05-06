package ru.job4j.loop;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * CounterTest
 * @author Sachenkov Maxim (oqiwhite1996@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class CounterTest {
    /**
     * method whenSumEvenNumbersFromOneToTenThenThirty
     * Проверяем, что сумма четных чисел от 1 до 10, равна 30
     */
    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        Counter counter = new Counter();
        int sum = counter.add(0, 10);
        assertThat(sum, is(30));
    }
}