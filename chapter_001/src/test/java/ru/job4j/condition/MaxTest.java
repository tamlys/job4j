package ru.job4j.condition;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * MaxTest
 * @author Sachenkov Maxim(oqiwhite1996@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        Max max = new Max();
        int result = max.max(1, 2);
        assertThat(result, is(2));
    }
    @Test
    public void whenMax2To1Then2() {
        Max max = new Max();
        int result = max.max(2, 1);
        assertThat(result, is(2));
    }
    @Test
    public void whenMax2To2Then2() {
        Max max = new Max();
        int result = max.max(2, 2);
        assertThat(result, is(2));
    }
    @Test
    public void whenMax2To1To3Then3() {
        Max max = new Max();
        int result = max.max(2, 1, 3);
        assertThat(result, is(3));
    }
    @Test
    public void whenMax2To2To1To5Then2() {
        Max max = new Max();
        int result = max.max(2, 2, 5, 1);
        assertThat(result, is(5));
    }
}