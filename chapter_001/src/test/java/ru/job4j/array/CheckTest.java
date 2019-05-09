package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * CheckTest
 * @author Sachenkov Maxim (oqiwhite1996@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class CheckTest {
    /**
     * whenDataMonoByTrueThenTrue
     * Проверяем, что все значения равны и выводим true
     */
    @Test
    public void whenDataMonoByTrueThenTrue() {
        Check check = new Check();
        boolean[] input = new boolean[] {true, true, true};
        boolean result = check.mono(input);
        assertThat(result, is(true));
    }
    /**
     * whenDataNotMonoByTrueThenFalse
     * Проверяем, что значения не равны и выводим false
     */
    @Test
    public void whenDataNotMonoByTrueThenFalse() {
        Check check = new Check();
        boolean[] input = new boolean[] {true, false, true};
        boolean result = check.mono(input);
        assertThat(result, is(false));
    }
    /**
     * whenDataNotMonoByFalseThenTrue
     * Проверяем, что все значения равны и выводим true
     */
    @Test
    public void whenDataNotMonoByFalseThenTrue() {
        Check check = new Check();
        boolean[] input = new boolean[] {false, false, false, false};
        boolean result = check.mono(input);
        assertThat(result, is(true));
    }
    /**
     * whenDataNotMonoByTrue2ThenFalse
     * Проверяем, что значения не равны и выводим false
     */
    @Test
    public void whenDataNotMonoByTrue2ThenFalse() {
        Check check = new Check();
        boolean[] input = new boolean[] {false, true, false, true};
        boolean result = check.mono(input);
        assertThat(result, is(false));
    }
}
