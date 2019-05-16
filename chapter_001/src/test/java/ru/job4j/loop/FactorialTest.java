package ru.job4j.loop;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Factorial
 * @author Maxim Sachenkov (oqiwhite1996@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class FactorialTest {
    /**
     * factorialFive
     * Проверяем, что факториал числа 5, равен 120
     */
    @Test
    public void factorialFive() {
        Factorial fact = new Factorial();
        int result = fact.calc(5);
        assertThat(result, is(120));
    }
    /**
     * factorialZero
     * Проверяем, что факториал числа 0, равен 1
     */
    @Test
    public void factorialZero() {
        Factorial fact = new Factorial();
        int result = fact.calc(0);
        assertThat(result, is(1));
    }
}